package com.guigu.system.po;

import java.util.ArrayList;
import java.util.List;

public class TempExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TempExample() {
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

        public Criteria andTempIdIsNull() {
            addCriterion("Temp_ID is null");
            return (Criteria) this;
        }

        public Criteria andTempIdIsNotNull() {
            addCriterion("Temp_ID is not null");
            return (Criteria) this;
        }

        public Criteria andTempIdEqualTo(Integer value) {
            addCriterion("Temp_ID =", value, "tempId");
            return (Criteria) this;
        }

        public Criteria andTempIdNotEqualTo(Integer value) {
            addCriterion("Temp_ID <>", value, "tempId");
            return (Criteria) this;
        }

        public Criteria andTempIdGreaterThan(Integer value) {
            addCriterion("Temp_ID >", value, "tempId");
            return (Criteria) this;
        }

        public Criteria andTempIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("Temp_ID >=", value, "tempId");
            return (Criteria) this;
        }

        public Criteria andTempIdLessThan(Integer value) {
            addCriterion("Temp_ID <", value, "tempId");
            return (Criteria) this;
        }

        public Criteria andTempIdLessThanOrEqualTo(Integer value) {
            addCriterion("Temp_ID <=", value, "tempId");
            return (Criteria) this;
        }

        public Criteria andTempIdIn(List<Integer> values) {
            addCriterion("Temp_ID in", values, "tempId");
            return (Criteria) this;
        }

        public Criteria andTempIdNotIn(List<Integer> values) {
            addCriterion("Temp_ID not in", values, "tempId");
            return (Criteria) this;
        }

        public Criteria andTempIdBetween(Integer value1, Integer value2) {
            addCriterion("Temp_ID between", value1, value2, "tempId");
            return (Criteria) this;
        }

        public Criteria andTempIdNotBetween(Integer value1, Integer value2) {
            addCriterion("Temp_ID not between", value1, value2, "tempId");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdIsNull() {
            addCriterion("Employee_Id is null");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdIsNotNull() {
            addCriterion("Employee_Id is not null");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdEqualTo(Integer value) {
            addCriterion("Employee_Id =", value, "employeeId");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdNotEqualTo(Integer value) {
            addCriterion("Employee_Id <>", value, "employeeId");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdGreaterThan(Integer value) {
            addCriterion("Employee_Id >", value, "employeeId");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("Employee_Id >=", value, "employeeId");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdLessThan(Integer value) {
            addCriterion("Employee_Id <", value, "employeeId");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdLessThanOrEqualTo(Integer value) {
            addCriterion("Employee_Id <=", value, "employeeId");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdIn(List<Integer> values) {
            addCriterion("Employee_Id in", values, "employeeId");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdNotIn(List<Integer> values) {
            addCriterion("Employee_Id not in", values, "employeeId");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdBetween(Integer value1, Integer value2) {
            addCriterion("Employee_Id between", value1, value2, "employeeId");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("Employee_Id not between", value1, value2, "employeeId");
            return (Criteria) this;
        }

        public Criteria andCardNumberIsNull() {
            addCriterion("Card_Number is null");
            return (Criteria) this;
        }

        public Criteria andCardNumberIsNotNull() {
            addCriterion("Card_Number is not null");
            return (Criteria) this;
        }

        public Criteria andCardNumberEqualTo(String value) {
            addCriterion("Card_Number =", value, "cardNumber");
            return (Criteria) this;
        }

        public Criteria andCardNumberNotEqualTo(String value) {
            addCriterion("Card_Number <>", value, "cardNumber");
            return (Criteria) this;
        }

        public Criteria andCardNumberGreaterThan(String value) {
            addCriterion("Card_Number >", value, "cardNumber");
            return (Criteria) this;
        }

        public Criteria andCardNumberGreaterThanOrEqualTo(String value) {
            addCriterion("Card_Number >=", value, "cardNumber");
            return (Criteria) this;
        }

        public Criteria andCardNumberLessThan(String value) {
            addCriterion("Card_Number <", value, "cardNumber");
            return (Criteria) this;
        }

        public Criteria andCardNumberLessThanOrEqualTo(String value) {
            addCriterion("Card_Number <=", value, "cardNumber");
            return (Criteria) this;
        }

        public Criteria andCardNumberLike(String value) {
            addCriterion("Card_Number like", value, "cardNumber");
            return (Criteria) this;
        }

        public Criteria andCardNumberNotLike(String value) {
            addCriterion("Card_Number not like", value, "cardNumber");
            return (Criteria) this;
        }

        public Criteria andCardNumberIn(List<String> values) {
            addCriterion("Card_Number in", values, "cardNumber");
            return (Criteria) this;
        }

        public Criteria andCardNumberNotIn(List<String> values) {
            addCriterion("Card_Number not in", values, "cardNumber");
            return (Criteria) this;
        }

        public Criteria andCardNumberBetween(String value1, String value2) {
            addCriterion("Card_Number between", value1, value2, "cardNumber");
            return (Criteria) this;
        }

        public Criteria andCardNumberNotBetween(String value1, String value2) {
            addCriterion("Card_Number not between", value1, value2, "cardNumber");
            return (Criteria) this;
        }

        public Criteria andTempDepartmentIdIsNull() {
            addCriterion("Temp_Department_ID is null");
            return (Criteria) this;
        }

        public Criteria andTempDepartmentIdIsNotNull() {
            addCriterion("Temp_Department_ID is not null");
            return (Criteria) this;
        }

        public Criteria andTempDepartmentIdEqualTo(Integer value) {
            addCriterion("Temp_Department_ID =", value, "tempDepartmentId");
            return (Criteria) this;
        }

        public Criteria andTempDepartmentIdNotEqualTo(Integer value) {
            addCriterion("Temp_Department_ID <>", value, "tempDepartmentId");
            return (Criteria) this;
        }

        public Criteria andTempDepartmentIdGreaterThan(Integer value) {
            addCriterion("Temp_Department_ID >", value, "tempDepartmentId");
            return (Criteria) this;
        }

        public Criteria andTempDepartmentIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("Temp_Department_ID >=", value, "tempDepartmentId");
            return (Criteria) this;
        }

        public Criteria andTempDepartmentIdLessThan(Integer value) {
            addCriterion("Temp_Department_ID <", value, "tempDepartmentId");
            return (Criteria) this;
        }

        public Criteria andTempDepartmentIdLessThanOrEqualTo(Integer value) {
            addCriterion("Temp_Department_ID <=", value, "tempDepartmentId");
            return (Criteria) this;
        }

        public Criteria andTempDepartmentIdIn(List<Integer> values) {
            addCriterion("Temp_Department_ID in", values, "tempDepartmentId");
            return (Criteria) this;
        }

        public Criteria andTempDepartmentIdNotIn(List<Integer> values) {
            addCriterion("Temp_Department_ID not in", values, "tempDepartmentId");
            return (Criteria) this;
        }

        public Criteria andTempDepartmentIdBetween(Integer value1, Integer value2) {
            addCriterion("Temp_Department_ID between", value1, value2, "tempDepartmentId");
            return (Criteria) this;
        }

        public Criteria andTempDepartmentIdNotBetween(Integer value1, Integer value2) {
            addCriterion("Temp_Department_ID not between", value1, value2, "tempDepartmentId");
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