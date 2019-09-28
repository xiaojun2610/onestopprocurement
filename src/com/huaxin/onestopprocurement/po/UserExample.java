package com.huaxin.onestopprocurement.po;

import java.util.ArrayList;
import java.util.List;

public class UserExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andUserIdIsNull() {
            addCriterion("user-id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user-id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Integer value) {
            addCriterion("user-id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Integer value) {
            addCriterion("user-id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Integer value) {
            addCriterion("user-id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("user-id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Integer value) {
            addCriterion("user-id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("user-id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Integer> values) {
            addCriterion("user-id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Integer> values) {
            addCriterion("user-id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Integer value1, Integer value2) {
            addCriterion("user-id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("user-id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNull() {
            addCriterion("user-name is null");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNotNull() {
            addCriterion("user-name is not null");
            return (Criteria) this;
        }

        public Criteria andUserNameEqualTo(String value) {
            addCriterion("user-name =", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotEqualTo(String value) {
            addCriterion("user-name <>", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThan(String value) {
            addCriterion("user-name >", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("user-name >=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThan(String value) {
            addCriterion("user-name <", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThanOrEqualTo(String value) {
            addCriterion("user-name <=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLike(String value) {
            addCriterion("user-name like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotLike(String value) {
            addCriterion("user-name not like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameIn(List<String> values) {
            addCriterion("user-name in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotIn(List<String> values) {
            addCriterion("user-name not in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameBetween(String value1, String value2) {
            addCriterion("user-name between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotBetween(String value1, String value2) {
            addCriterion("user-name not between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andUserPasswordIsNull() {
            addCriterion("user-password is null");
            return (Criteria) this;
        }

        public Criteria andUserPasswordIsNotNull() {
            addCriterion("user-password is not null");
            return (Criteria) this;
        }

        public Criteria andUserPasswordEqualTo(String value) {
            addCriterion("user-password =", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordNotEqualTo(String value) {
            addCriterion("user-password <>", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordGreaterThan(String value) {
            addCriterion("user-password >", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("user-password >=", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordLessThan(String value) {
            addCriterion("user-password <", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordLessThanOrEqualTo(String value) {
            addCriterion("user-password <=", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordLike(String value) {
            addCriterion("user-password like", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordNotLike(String value) {
            addCriterion("user-password not like", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordIn(List<String> values) {
            addCriterion("user-password in", values, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordNotIn(List<String> values) {
            addCriterion("user-password not in", values, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordBetween(String value1, String value2) {
            addCriterion("user-password between", value1, value2, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordNotBetween(String value1, String value2) {
            addCriterion("user-password not between", value1, value2, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserEmailIsNull() {
            addCriterion("user-email is null");
            return (Criteria) this;
        }

        public Criteria andUserEmailIsNotNull() {
            addCriterion("user-email is not null");
            return (Criteria) this;
        }

        public Criteria andUserEmailEqualTo(String value) {
            addCriterion("user-email =", value, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailNotEqualTo(String value) {
            addCriterion("user-email <>", value, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailGreaterThan(String value) {
            addCriterion("user-email >", value, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailGreaterThanOrEqualTo(String value) {
            addCriterion("user-email >=", value, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailLessThan(String value) {
            addCriterion("user-email <", value, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailLessThanOrEqualTo(String value) {
            addCriterion("user-email <=", value, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailLike(String value) {
            addCriterion("user-email like", value, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailNotLike(String value) {
            addCriterion("user-email not like", value, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailIn(List<String> values) {
            addCriterion("user-email in", values, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailNotIn(List<String> values) {
            addCriterion("user-email not in", values, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailBetween(String value1, String value2) {
            addCriterion("user-email between", value1, value2, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailNotBetween(String value1, String value2) {
            addCriterion("user-email not between", value1, value2, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserInfoIsNull() {
            addCriterion("user-info is null");
            return (Criteria) this;
        }

        public Criteria andUserInfoIsNotNull() {
            addCriterion("user-info is not null");
            return (Criteria) this;
        }

        public Criteria andUserInfoEqualTo(String value) {
            addCriterion("user-info =", value, "userInfo");
            return (Criteria) this;
        }

        public Criteria andUserInfoNotEqualTo(String value) {
            addCriterion("user-info <>", value, "userInfo");
            return (Criteria) this;
        }

        public Criteria andUserInfoGreaterThan(String value) {
            addCriterion("user-info >", value, "userInfo");
            return (Criteria) this;
        }

        public Criteria andUserInfoGreaterThanOrEqualTo(String value) {
            addCriterion("user-info >=", value, "userInfo");
            return (Criteria) this;
        }

        public Criteria andUserInfoLessThan(String value) {
            addCriterion("user-info <", value, "userInfo");
            return (Criteria) this;
        }

        public Criteria andUserInfoLessThanOrEqualTo(String value) {
            addCriterion("user-info <=", value, "userInfo");
            return (Criteria) this;
        }

        public Criteria andUserInfoLike(String value) {
            addCriterion("user-info like", value, "userInfo");
            return (Criteria) this;
        }

        public Criteria andUserInfoNotLike(String value) {
            addCriterion("user-info not like", value, "userInfo");
            return (Criteria) this;
        }

        public Criteria andUserInfoIn(List<String> values) {
            addCriterion("user-info in", values, "userInfo");
            return (Criteria) this;
        }

        public Criteria andUserInfoNotIn(List<String> values) {
            addCriterion("user-info not in", values, "userInfo");
            return (Criteria) this;
        }

        public Criteria andUserInfoBetween(String value1, String value2) {
            addCriterion("user-info between", value1, value2, "userInfo");
            return (Criteria) this;
        }

        public Criteria andUserInfoNotBetween(String value1, String value2) {
            addCriterion("user-info not between", value1, value2, "userInfo");
            return (Criteria) this;
        }

        public Criteria andUserAddressIsNull() {
            addCriterion("user-address is null");
            return (Criteria) this;
        }

        public Criteria andUserAddressIsNotNull() {
            addCriterion("user-address is not null");
            return (Criteria) this;
        }

        public Criteria andUserAddressEqualTo(String value) {
            addCriterion("user-address =", value, "userAddress");
            return (Criteria) this;
        }

        public Criteria andUserAddressNotEqualTo(String value) {
            addCriterion("user-address <>", value, "userAddress");
            return (Criteria) this;
        }

        public Criteria andUserAddressGreaterThan(String value) {
            addCriterion("user-address >", value, "userAddress");
            return (Criteria) this;
        }

        public Criteria andUserAddressGreaterThanOrEqualTo(String value) {
            addCriterion("user-address >=", value, "userAddress");
            return (Criteria) this;
        }

        public Criteria andUserAddressLessThan(String value) {
            addCriterion("user-address <", value, "userAddress");
            return (Criteria) this;
        }

        public Criteria andUserAddressLessThanOrEqualTo(String value) {
            addCriterion("user-address <=", value, "userAddress");
            return (Criteria) this;
        }

        public Criteria andUserAddressLike(String value) {
            addCriterion("user-address like", value, "userAddress");
            return (Criteria) this;
        }

        public Criteria andUserAddressNotLike(String value) {
            addCriterion("user-address not like", value, "userAddress");
            return (Criteria) this;
        }

        public Criteria andUserAddressIn(List<String> values) {
            addCriterion("user-address in", values, "userAddress");
            return (Criteria) this;
        }

        public Criteria andUserAddressNotIn(List<String> values) {
            addCriterion("user-address not in", values, "userAddress");
            return (Criteria) this;
        }

        public Criteria andUserAddressBetween(String value1, String value2) {
            addCriterion("user-address between", value1, value2, "userAddress");
            return (Criteria) this;
        }

        public Criteria andUserAddressNotBetween(String value1, String value2) {
            addCriterion("user-address not between", value1, value2, "userAddress");
            return (Criteria) this;
        }

        public Criteria andUserMobilephoneIsNull() {
            addCriterion("user-mobilephone is null");
            return (Criteria) this;
        }

        public Criteria andUserMobilephoneIsNotNull() {
            addCriterion("user-mobilephone is not null");
            return (Criteria) this;
        }

        public Criteria andUserMobilephoneEqualTo(Long value) {
            addCriterion("user-mobilephone =", value, "userMobilephone");
            return (Criteria) this;
        }

        public Criteria andUserMobilephoneNotEqualTo(Long value) {
            addCriterion("user-mobilephone <>", value, "userMobilephone");
            return (Criteria) this;
        }

        public Criteria andUserMobilephoneGreaterThan(Long value) {
            addCriterion("user-mobilephone >", value, "userMobilephone");
            return (Criteria) this;
        }

        public Criteria andUserMobilephoneGreaterThanOrEqualTo(Long value) {
            addCriterion("user-mobilephone >=", value, "userMobilephone");
            return (Criteria) this;
        }

        public Criteria andUserMobilephoneLessThan(Long value) {
            addCriterion("user-mobilephone <", value, "userMobilephone");
            return (Criteria) this;
        }

        public Criteria andUserMobilephoneLessThanOrEqualTo(Long value) {
            addCriterion("user-mobilephone <=", value, "userMobilephone");
            return (Criteria) this;
        }

        public Criteria andUserMobilephoneIn(List<Long> values) {
            addCriterion("user-mobilephone in", values, "userMobilephone");
            return (Criteria) this;
        }

        public Criteria andUserMobilephoneNotIn(List<Long> values) {
            addCriterion("user-mobilephone not in", values, "userMobilephone");
            return (Criteria) this;
        }

        public Criteria andUserMobilephoneBetween(Long value1, Long value2) {
            addCriterion("user-mobilephone between", value1, value2, "userMobilephone");
            return (Criteria) this;
        }

        public Criteria andUserMobilephoneNotBetween(Long value1, Long value2) {
            addCriterion("user-mobilephone not between", value1, value2, "userMobilephone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneIsNull() {
            addCriterion("user-phone is null");
            return (Criteria) this;
        }

        public Criteria andUserPhoneIsNotNull() {
            addCriterion("user-phone is not null");
            return (Criteria) this;
        }

        public Criteria andUserPhoneEqualTo(String value) {
            addCriterion("user-phone =", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneNotEqualTo(String value) {
            addCriterion("user-phone <>", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneGreaterThan(String value) {
            addCriterion("user-phone >", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("user-phone >=", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneLessThan(String value) {
            addCriterion("user-phone <", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneLessThanOrEqualTo(String value) {
            addCriterion("user-phone <=", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneLike(String value) {
            addCriterion("user-phone like", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneNotLike(String value) {
            addCriterion("user-phone not like", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneIn(List<String> values) {
            addCriterion("user-phone in", values, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneNotIn(List<String> values) {
            addCriterion("user-phone not in", values, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneBetween(String value1, String value2) {
            addCriterion("user-phone between", value1, value2, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneNotBetween(String value1, String value2) {
            addCriterion("user-phone not between", value1, value2, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserBonuspointIsNull() {
            addCriterion("user-bonuspoint is null");
            return (Criteria) this;
        }

        public Criteria andUserBonuspointIsNotNull() {
            addCriterion("user-bonuspoint is not null");
            return (Criteria) this;
        }

        public Criteria andUserBonuspointEqualTo(Integer value) {
            addCriterion("user-bonuspoint =", value, "userBonuspoint");
            return (Criteria) this;
        }

        public Criteria andUserBonuspointNotEqualTo(Integer value) {
            addCriterion("user-bonuspoint <>", value, "userBonuspoint");
            return (Criteria) this;
        }

        public Criteria andUserBonuspointGreaterThan(Integer value) {
            addCriterion("user-bonuspoint >", value, "userBonuspoint");
            return (Criteria) this;
        }

        public Criteria andUserBonuspointGreaterThanOrEqualTo(Integer value) {
            addCriterion("user-bonuspoint >=", value, "userBonuspoint");
            return (Criteria) this;
        }

        public Criteria andUserBonuspointLessThan(Integer value) {
            addCriterion("user-bonuspoint <", value, "userBonuspoint");
            return (Criteria) this;
        }

        public Criteria andUserBonuspointLessThanOrEqualTo(Integer value) {
            addCriterion("user-bonuspoint <=", value, "userBonuspoint");
            return (Criteria) this;
        }

        public Criteria andUserBonuspointIn(List<Integer> values) {
            addCriterion("user-bonuspoint in", values, "userBonuspoint");
            return (Criteria) this;
        }

        public Criteria andUserBonuspointNotIn(List<Integer> values) {
            addCriterion("user-bonuspoint not in", values, "userBonuspoint");
            return (Criteria) this;
        }

        public Criteria andUserBonuspointBetween(Integer value1, Integer value2) {
            addCriterion("user-bonuspoint between", value1, value2, "userBonuspoint");
            return (Criteria) this;
        }

        public Criteria andUserBonuspointNotBetween(Integer value1, Integer value2) {
            addCriterion("user-bonuspoint not between", value1, value2, "userBonuspoint");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}