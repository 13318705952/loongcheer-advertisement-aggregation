package com.loongcheer.advertisement.api.util;

import lombok.Data;
import org.hibernate.validator.HibernateValidator;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/**
 * @Description   :  validationUtil工具类
 * @Author        :  pengjinyang
 * @CreateDate    :  2019/11/19 15:30
 * @UpdateNote    :
 * @Version       :  1. v1.0
 */
public class ValidationUtil {
    /**
     * 使用例子
     * ValidationUtil.ValidResult validResult = ValidationUtil.validateBean(实体类);
     */
    /**
     * 开启快速结束模式 failFast (true)
     *
     *
     * 　　普通模式(会校验完所有的属性，然后返回所有的验证失败信息)
     *
     * 2、快速失败返回模式
     * 　　快速失败返回模式(只要有一个验证失败，则返回)
     *
     * 两种验证模式配置方式：（参考官方文档）
     *
     * failFast：true  快速失败返回模式    false 普通模式
     *
     * ValidatorFactory validatorFactory = Validation.byProvider( HibernateValidator.class )
     *         .configure()
     *         .failFast( true )
     *         .buildValidatorFactory();
     * Validator validator = validatorFactory.getValidator();
     * 和 （hibernate.validator.fail_fast：true  快速失败返回模式    false 普通模式）
     *
     * ValidatorFactory validatorFactory = Validation.byProvider( HibernateValidator.class )
     *         .configure()
     *         .addProperty( "hibernate.validator.fail_fast", "true" )
     *         .buildValidatorFactory();
     * Validator validator = validatorFactory.getValidator();
     *
     * https://www.cnblogs.com/mr-yang-localhost/p/7812038.html
     */
    private static Validator validator = Validation.byProvider(HibernateValidator.class).configure().failFast(false).buildValidatorFactory().getValidator();

    /**
     * 校验对象
     *
     * @param t      bean
     * @param groups 校验组
     * @return ValidResult
     */
    public static <T> ValidResult validateBean(T t, Class<?>... groups) {
        ValidResult result = new ValidationUtil().new ValidResult();
        Set<ConstraintViolation<T>> violationSet = validator.validate(t, groups);
        boolean hasError = violationSet != null && violationSet.size() > 0;
        result.setHasErrors(hasError);
        if (hasError) {
            for (ConstraintViolation<T> violation : violationSet) {
                result.addError(violation.getPropertyPath().toString(), violation.getMessage());
            }
        }
        return result;
    }

    /**
     * 校验bean的某一个属性
     *
     * @param obj          bean
     * @param propertyName 属性名称
     * @return ValidResult
     */
    public static <T> ValidResult validateProperty(T obj, String propertyName) {
        ValidResult result = new ValidationUtil().new ValidResult();
        Set<ConstraintViolation<T>> violationSet = validator.validateProperty(obj, propertyName);
        boolean hasError = violationSet != null && violationSet.size() > 0;
        result.setHasErrors(hasError);
        if (hasError) {
            for (ConstraintViolation<T> violation : violationSet) {
                result.addError(propertyName, violation.getMessage());
            }
        }
        return result;
    }

    /**
     * 校验结果类
     */
    @Data
    public class ValidResult {

        /**
         * 是否有错误
         */
        private boolean hasErrors;

        /**
         * 错误信息
         */
        private List<ErrorMessage> errors;

        public ValidResult() {
            this.errors = new ArrayList<>();
        }

        public boolean hasErrors() {
            return hasErrors;
        }

        public void setHasErrors(boolean hasErrors) {
            this.hasErrors = hasErrors;
        }

        /**
         * 获取所有验证信息
         *
         * @return 集合形式
         */
        public List<ErrorMessage> getAllErrors() {
            return errors;
        }

        /**
         * 获取所有验证信息
         *
         * @return 字符串形式
         */
        public String getErrors() {
            StringBuilder sb = new StringBuilder();
            for (ErrorMessage error : errors) {
                sb.append(error.getPropertyPath());
                sb.append(" ");
                sb.append(error.getMessage()).append(" ");
            }
            return sb.toString();
        }

        /**
         * 获取所有验证信息(帶參數名)
         *
         * @return 字符串形式
         */
        public String getParamNameErrors() {
            StringBuilder sb = new StringBuilder();
            for (ErrorMessage error : errors) {
                sb.append(error.getPropertyPath()).append(":").append(error.getMessage()).append(" ");
            }
            return sb.toString();
        }

        public void addError(String propertyName, String message) {
            this.errors.add(new ErrorMessage(propertyName, message));
        }
    }

    @Data
    public class ErrorMessage {

        private String propertyPath;

        private String message;

        public ErrorMessage() {
        }

        public ErrorMessage(String propertyPath, String message) {
            this.propertyPath = propertyPath;
            this.message = message;
        }
    }

}