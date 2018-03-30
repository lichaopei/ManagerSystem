package com.guigu.system.po;

import java.util.ArrayList;
import java.util.List;

public class AdminExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AdminExample() {
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

        public Criteria andAdminIdIsNull() {
            addCriterion("Admin_ID is null");
            return (Criteria) this;
        }

        public Criteria andAdminIdIsNotNull() {
            addCriterion("Admin_ID is not null");
            return (Criteria) this;
        }

        public Criteria andAdminIdEqualTo(Integer value) {
            addCriterion("Admin_ID =", value, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdNotEqualTo(Integer value) {
            addCriterion("Admin_ID <>", value, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdGreaterThan(Integer value) {
            addCriterion("Admin_ID >", value, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("Admin_ID >=", value, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdLessThan(Integer value) {
            addCriterion("Admin_ID <", value, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdLessThanOrEqualTo(Integer value) {
            addCriterion("Admin_ID <=", value, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdIn(List<Integer> values) {
            addCriterion("Admin_ID in", values, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdNotIn(List<Integer> values) {
            addCriterion("Admin_ID not in", values, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdBetween(Integer value1, Integer value2) {
            addCriterion("Admin_ID between", value1, value2, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdNotBetween(Integer value1, Integer value2) {
            addCriterion("Admin_ID not between", value1, value2, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminAccountIsNull() {
            addCriterion("Admin_Account is null");
            return (Criteria) this;
        }

        public Criteria andAdminAccountIsNotNull() {
            addCriterion("Admin_Account is not null");
            return (Criteria) this;
        }

        public Criteria andAdminAccountEqualTo(String value) {
            addCriterion("Admin_Account =", value, "adminAccount");
            return (Criteria) this;
        }

        public Criteria andAdminAccountNotEqualTo(String value) {
            addCriterion("Admin_Account <>", value, "adminAccount");
            return (Criteria) this;
        }

        public Criteria andAdminAccountGreaterThan(String value) {
            addCriterion("Admin_Account >", value, "adminAccount");
            return (Criteria) this;
        }

        public Criteria andAdminAccountGreaterThanOrEqualTo(String value) {
            addCriterion("Admin_Account >=", value, "adminAccount");
            return (Criteria) this;
        }

        public Criteria andAdminAccountLessThan(String value) {
            addCriterion("Admin_Account <", value, "adminAccount");
            return (Criteria) this;
        }

        public Criteria andAdminAccountLessThanOrEqualTo(String value) {
            addCriterion("Admin_Account <=", value, "adminAccount");
            return (Criteria) this;
        }

        public Criteria andAdminAccountLike(String value) {
            addCriterion("Admin_Account like", value, "adminAccount");
            return (Criteria) this;
        }

        public Criteria andAdminAccountNotLike(String value) {
            addCriterion("Admin_Account not like", value, "adminAccount");
            return (Criteria) this;
        }

        public Criteria andAdminAccountIn(List<String> values) {
            addCriterion("Admin_Account in", values, "adminAccount");
            return (Criteria) this;
        }

        public Criteria andAdminAccountNotIn(List<String> values) {
            addCriterion("Admin_Account not in", values, "adminAccount");
            return (Criteria) this;
        }

        public Criteria andAdminAccountBetween(String value1, String value2) {
            addCriterion("Admin_Account between", value1, value2, "adminAccount");
            return (Criteria) this;
        }

        public Criteria andAdminAccountNotBetween(String value1, String value2) {
            addCriterion("Admin_Account not between", value1, value2, "adminAccount");
            return (Criteria) this;
        }

        public Criteria andAdminPwdIsNull() {
            addCriterion("Admin_Pwd is null");
            return (Criteria) this;
        }

        public Criteria andAdminPwdIsNotNull() {
            addCriterion("Admin_Pwd is not null");
            return (Criteria) this;
        }

        public Criteria andAdminPwdEqualTo(String value) {
            addCriterion("Admin_Pwd =", value, "adminPwd");
            return (Criteria) this;
        }

        public Criteria andAdminPwdNotEqualTo(String value) {
            addCriterion("Admin_Pwd <>", value, "adminPwd");
            return (Criteria) this;
        }

        public Criteria andAdminPwdGreaterThan(String value) {
            addCriterion("Admin_Pwd >", value, "adminPwd");
            return (Criteria) this;
        }

        public Criteria andAdminPwdGreaterThanOrEqualTo(String value) {
            addCriterion("Admin_Pwd >=", value, "adminPwd");
            return (Criteria) this;
        }

        public Criteria andAdminPwdLessThan(String value) {
            addCriterion("Admin_Pwd <", value, "adminPwd");
            return (Criteria) this;
        }

        public Criteria andAdminPwdLessThanOrEqualTo(String value) {
            addCriterion("Admin_Pwd <=", value, "adminPwd");
            return (Criteria) this;
        }

        public Criteria andAdminPwdLike(String value) {
            addCriterion("Admin_Pwd like", value, "adminPwd");
            return (Criteria) this;
        }

        public Criteria andAdminPwdNotLike(String value) {
            addCriterion("Admin_Pwd not like", value, "adminPwd");
            return (Criteria) this;
        }

        public Criteria andAdminPwdIn(List<String> values) {
            addCriterion("Admin_Pwd in", values, "adminPwd");
            return (Criteria) this;
        }

        public Criteria andAdminPwdNotIn(List<String> values) {
            addCriterion("Admin_Pwd not in", values, "adminPwd");
            return (Criteria) this;
        }

        public Criteria andAdminPwdBetween(String value1, String value2) {
            addCriterion("Admin_Pwd between", value1, value2, "adminPwd");
            return (Criteria) this;
        }

        public Criteria andAdminPwdNotBetween(String value1, String value2) {
            addCriterion("Admin_Pwd not between", value1, value2, "adminPwd");
            return (Criteria) this;
        }

        public Criteria andAdminStateIsNull() {
            addCriterion("Admin_State is null");
            return (Criteria) this;
        }

        public Criteria andAdminStateIsNotNull() {
            addCriterion("Admin_State is not null");
            return (Criteria) this;
        }

        public Criteria andAdminStateEqualTo(String value) {
            addCriterion("Admin_State =", value, "adminState");
            return (Criteria) this;
        }

        public Criteria andAdminStateNotEqualTo(String value) {
            addCriterion("Admin_State <>", value, "adminState");
            return (Criteria) this;
        }

        public Criteria andAdminStateGreaterThan(String value) {
            addCriterion("Admin_State >", value, "adminState");
            return (Criteria) this;
        }

        public Criteria andAdminStateGreaterThanOrEqualTo(String value) {
            addCriterion("Admin_State >=", value, "adminState");
            return (Criteria) this;
        }

        public Criteria andAdminStateLessThan(String value) {
            addCriterion("Admin_State <", value, "adminState");
            return (Criteria) this;
        }

        public Criteria andAdminStateLessThanOrEqualTo(String value) {
            addCriterion("Admin_State <=", value, "adminState");
            return (Criteria) this;
        }

        public Criteria andAdminStateLike(String value) {
            addCriterion("Admin_State like", value, "adminState");
            return (Criteria) this;
        }

        public Criteria andAdminStateNotLike(String value) {
            addCriterion("Admin_State not like", value, "adminState");
            return (Criteria) this;
        }

        public Criteria andAdminStateIn(List<String> values) {
            addCriterion("Admin_State in", values, "adminState");
            return (Criteria) this;
        }

        public Criteria andAdminStateNotIn(List<String> values) {
            addCriterion("Admin_State not in", values, "adminState");
            return (Criteria) this;
        }

        public Criteria andAdminStateBetween(String value1, String value2) {
            addCriterion("Admin_State between", value1, value2, "adminState");
            return (Criteria) this;
        }

        public Criteria andAdminStateNotBetween(String value1, String value2) {
            addCriterion("Admin_State not between", value1, value2, "adminState");
            return (Criteria) this;
        }

        public Criteria andAdminRightIsNull() {
            addCriterion("Admin_Right is null");
            return (Criteria) this;
        }

        public Criteria andAdminRightIsNotNull() {
            addCriterion("Admin_Right is not null");
            return (Criteria) this;
        }

        public Criteria andAdminRightEqualTo(String value) {
            addCriterion("Admin_Right =", value, "adminRight");
            return (Criteria) this;
        }

        public Criteria andAdminRightNotEqualTo(String value) {
            addCriterion("Admin_Right <>", value, "adminRight");
            return (Criteria) this;
        }

        public Criteria andAdminRightGreaterThan(String value) {
            addCriterion("Admin_Right >", value, "adminRight");
            return (Criteria) this;
        }

        public Criteria andAdminRightGreaterThanOrEqualTo(String value) {
            addCriterion("Admin_Right >=", value, "adminRight");
            return (Criteria) this;
        }

        public Criteria andAdminRightLessThan(String value) {
            addCriterion("Admin_Right <", value, "adminRight");
            return (Criteria) this;
        }

        public Criteria andAdminRightLessThanOrEqualTo(String value) {
            addCriterion("Admin_Right <=", value, "adminRight");
            return (Criteria) this;
        }

        public Criteria andAdminRightLike(String value) {
            addCriterion("Admin_Right like", value, "adminRight");
            return (Criteria) this;
        }

        public Criteria andAdminRightNotLike(String value) {
            addCriterion("Admin_Right not like", value, "adminRight");
            return (Criteria) this;
        }

        public Criteria andAdminRightIn(List<String> values) {
            addCriterion("Admin_Right in", values, "adminRight");
            return (Criteria) this;
        }

        public Criteria andAdminRightNotIn(List<String> values) {
            addCriterion("Admin_Right not in", values, "adminRight");
            return (Criteria) this;
        }

        public Criteria andAdminRightBetween(String value1, String value2) {
            addCriterion("Admin_Right between", value1, value2, "adminRight");
            return (Criteria) this;
        }

        public Criteria andAdminRightNotBetween(String value1, String value2) {
            addCriterion("Admin_Right not between", value1, value2, "adminRight");
            return (Criteria) this;
        }

        public Criteria andAdminNameIsNull() {
            addCriterion("Admin_Name is null");
            return (Criteria) this;
        }

        public Criteria andAdminNameIsNotNull() {
            addCriterion("Admin_Name is not null");
            return (Criteria) this;
        }

        public Criteria andAdminNameEqualTo(String value) {
            addCriterion("Admin_Name =", value, "adminName");
            return (Criteria) this;
        }

        public Criteria andAdminNameNotEqualTo(String value) {
            addCriterion("Admin_Name <>", value, "adminName");
            return (Criteria) this;
        }

        public Criteria andAdminNameGreaterThan(String value) {
            addCriterion("Admin_Name >", value, "adminName");
            return (Criteria) this;
        }

        public Criteria andAdminNameGreaterThanOrEqualTo(String value) {
            addCriterion("Admin_Name >=", value, "adminName");
            return (Criteria) this;
        }

        public Criteria andAdminNameLessThan(String value) {
            addCriterion("Admin_Name <", value, "adminName");
            return (Criteria) this;
        }

        public Criteria andAdminNameLessThanOrEqualTo(String value) {
            addCriterion("Admin_Name <=", value, "adminName");
            return (Criteria) this;
        }

        public Criteria andAdminNameLike(String value) {
            addCriterion("Admin_Name like", value, "adminName");
            return (Criteria) this;
        }

        public Criteria andAdminNameNotLike(String value) {
            addCriterion("Admin_Name not like", value, "adminName");
            return (Criteria) this;
        }

        public Criteria andAdminNameIn(List<String> values) {
            addCriterion("Admin_Name in", values, "adminName");
            return (Criteria) this;
        }

        public Criteria andAdminNameNotIn(List<String> values) {
            addCriterion("Admin_Name not in", values, "adminName");
            return (Criteria) this;
        }

        public Criteria andAdminNameBetween(String value1, String value2) {
            addCriterion("Admin_Name between", value1, value2, "adminName");
            return (Criteria) this;
        }

        public Criteria andAdminNameNotBetween(String value1, String value2) {
            addCriterion("Admin_Name not between", value1, value2, "adminName");
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