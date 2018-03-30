package com.guigu.system.po;

import java.util.ArrayList;
import java.util.List;

public class EmployeesExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public EmployeesExample() {
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

        public Criteria andEmployeeIdIsNull() {
            addCriterion("Employee_ID is null");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdIsNotNull() {
            addCriterion("Employee_ID is not null");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdEqualTo(Integer value) {
            addCriterion("Employee_ID =", value, "employeeId");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdNotEqualTo(Integer value) {
            addCriterion("Employee_ID <>", value, "employeeId");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdGreaterThan(Integer value) {
            addCriterion("Employee_ID >", value, "employeeId");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("Employee_ID >=", value, "employeeId");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdLessThan(Integer value) {
            addCriterion("Employee_ID <", value, "employeeId");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdLessThanOrEqualTo(Integer value) {
            addCriterion("Employee_ID <=", value, "employeeId");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdIn(List<Integer> values) {
            addCriterion("Employee_ID in", values, "employeeId");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdNotIn(List<Integer> values) {
            addCriterion("Employee_ID not in", values, "employeeId");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdBetween(Integer value1, Integer value2) {
            addCriterion("Employee_ID between", value1, value2, "employeeId");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("Employee_ID not between", value1, value2, "employeeId");
            return (Criteria) this;
        }

        public Criteria andEmployeeNameIsNull() {
            addCriterion("Employee_Name is null");
            return (Criteria) this;
        }

        public Criteria andEmployeeNameIsNotNull() {
            addCriterion("Employee_Name is not null");
            return (Criteria) this;
        }

        public Criteria andEmployeeNameEqualTo(String value) {
            addCriterion("Employee_Name =", value, "employeeName");
            return (Criteria) this;
        }

        public Criteria andEmployeeNameNotEqualTo(String value) {
            addCriterion("Employee_Name <>", value, "employeeName");
            return (Criteria) this;
        }

        public Criteria andEmployeeNameGreaterThan(String value) {
            addCriterion("Employee_Name >", value, "employeeName");
            return (Criteria) this;
        }

        public Criteria andEmployeeNameGreaterThanOrEqualTo(String value) {
            addCriterion("Employee_Name >=", value, "employeeName");
            return (Criteria) this;
        }

        public Criteria andEmployeeNameLessThan(String value) {
            addCriterion("Employee_Name <", value, "employeeName");
            return (Criteria) this;
        }

        public Criteria andEmployeeNameLessThanOrEqualTo(String value) {
            addCriterion("Employee_Name <=", value, "employeeName");
            return (Criteria) this;
        }

        public Criteria andEmployeeNameLike(String value) {
            addCriterion("Employee_Name like", value, "employeeName");
            return (Criteria) this;
        }

        public Criteria andEmployeeNameNotLike(String value) {
            addCriterion("Employee_Name not like", value, "employeeName");
            return (Criteria) this;
        }

        public Criteria andEmployeeNameIn(List<String> values) {
            addCriterion("Employee_Name in", values, "employeeName");
            return (Criteria) this;
        }

        public Criteria andEmployeeNameNotIn(List<String> values) {
            addCriterion("Employee_Name not in", values, "employeeName");
            return (Criteria) this;
        }

        public Criteria andEmployeeNameBetween(String value1, String value2) {
            addCriterion("Employee_Name between", value1, value2, "employeeName");
            return (Criteria) this;
        }

        public Criteria andEmployeeNameNotBetween(String value1, String value2) {
            addCriterion("Employee_Name not between", value1, value2, "employeeName");
            return (Criteria) this;
        }

        public Criteria andEmployeeGenderIsNull() {
            addCriterion("Employee_Gender is null");
            return (Criteria) this;
        }

        public Criteria andEmployeeGenderIsNotNull() {
            addCriterion("Employee_Gender is not null");
            return (Criteria) this;
        }

        public Criteria andEmployeeGenderEqualTo(String value) {
            addCriterion("Employee_Gender =", value, "employeeGender");
            return (Criteria) this;
        }

        public Criteria andEmployeeGenderNotEqualTo(String value) {
            addCriterion("Employee_Gender <>", value, "employeeGender");
            return (Criteria) this;
        }

        public Criteria andEmployeeGenderGreaterThan(String value) {
            addCriterion("Employee_Gender >", value, "employeeGender");
            return (Criteria) this;
        }

        public Criteria andEmployeeGenderGreaterThanOrEqualTo(String value) {
            addCriterion("Employee_Gender >=", value, "employeeGender");
            return (Criteria) this;
        }

        public Criteria andEmployeeGenderLessThan(String value) {
            addCriterion("Employee_Gender <", value, "employeeGender");
            return (Criteria) this;
        }

        public Criteria andEmployeeGenderLessThanOrEqualTo(String value) {
            addCriterion("Employee_Gender <=", value, "employeeGender");
            return (Criteria) this;
        }

        public Criteria andEmployeeGenderLike(String value) {
            addCriterion("Employee_Gender like", value, "employeeGender");
            return (Criteria) this;
        }

        public Criteria andEmployeeGenderNotLike(String value) {
            addCriterion("Employee_Gender not like", value, "employeeGender");
            return (Criteria) this;
        }

        public Criteria andEmployeeGenderIn(List<String> values) {
            addCriterion("Employee_Gender in", values, "employeeGender");
            return (Criteria) this;
        }

        public Criteria andEmployeeGenderNotIn(List<String> values) {
            addCriterion("Employee_Gender not in", values, "employeeGender");
            return (Criteria) this;
        }

        public Criteria andEmployeeGenderBetween(String value1, String value2) {
            addCriterion("Employee_Gender between", value1, value2, "employeeGender");
            return (Criteria) this;
        }

        public Criteria andEmployeeGenderNotBetween(String value1, String value2) {
            addCriterion("Employee_Gender not between", value1, value2, "employeeGender");
            return (Criteria) this;
        }

        public Criteria andPositionIsNull() {
            addCriterion("Position is null");
            return (Criteria) this;
        }

        public Criteria andPositionIsNotNull() {
            addCriterion("Position is not null");
            return (Criteria) this;
        }

        public Criteria andPositionEqualTo(Integer value) {
            addCriterion("Position =", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionNotEqualTo(Integer value) {
            addCriterion("Position <>", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionGreaterThan(Integer value) {
            addCriterion("Position >", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionGreaterThanOrEqualTo(Integer value) {
            addCriterion("Position >=", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionLessThan(Integer value) {
            addCriterion("Position <", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionLessThanOrEqualTo(Integer value) {
            addCriterion("Position <=", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionIn(List<Integer> values) {
            addCriterion("Position in", values, "position");
            return (Criteria) this;
        }

        public Criteria andPositionNotIn(List<Integer> values) {
            addCriterion("Position not in", values, "position");
            return (Criteria) this;
        }

        public Criteria andPositionBetween(Integer value1, Integer value2) {
            addCriterion("Position between", value1, value2, "position");
            return (Criteria) this;
        }

        public Criteria andPositionNotBetween(Integer value1, Integer value2) {
            addCriterion("Position not between", value1, value2, "position");
            return (Criteria) this;
        }

        public Criteria andDepartmentIsNull() {
            addCriterion("Department is null");
            return (Criteria) this;
        }

        public Criteria andDepartmentIsNotNull() {
            addCriterion("Department is not null");
            return (Criteria) this;
        }

        public Criteria andDepartmentEqualTo(Integer value) {
            addCriterion("Department =", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentNotEqualTo(Integer value) {
            addCriterion("Department <>", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentGreaterThan(Integer value) {
            addCriterion("Department >", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentGreaterThanOrEqualTo(Integer value) {
            addCriterion("Department >=", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentLessThan(Integer value) {
            addCriterion("Department <", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentLessThanOrEqualTo(Integer value) {
            addCriterion("Department <=", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentIn(List<Integer> values) {
            addCriterion("Department in", values, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentNotIn(List<Integer> values) {
            addCriterion("Department not in", values, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentBetween(Integer value1, Integer value2) {
            addCriterion("Department between", value1, value2, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentNotBetween(Integer value1, Integer value2) {
            addCriterion("Department not between", value1, value2, "department");
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

        public Criteria andEmployeeStateIsNull() {
            addCriterion("Employee_State is null");
            return (Criteria) this;
        }

        public Criteria andEmployeeStateIsNotNull() {
            addCriterion("Employee_State is not null");
            return (Criteria) this;
        }

        public Criteria andEmployeeStateEqualTo(String value) {
            addCriterion("Employee_State =", value, "employeeState");
            return (Criteria) this;
        }

        public Criteria andEmployeeStateNotEqualTo(String value) {
            addCriterion("Employee_State <>", value, "employeeState");
            return (Criteria) this;
        }

        public Criteria andEmployeeStateGreaterThan(String value) {
            addCriterion("Employee_State >", value, "employeeState");
            return (Criteria) this;
        }

        public Criteria andEmployeeStateGreaterThanOrEqualTo(String value) {
            addCriterion("Employee_State >=", value, "employeeState");
            return (Criteria) this;
        }

        public Criteria andEmployeeStateLessThan(String value) {
            addCriterion("Employee_State <", value, "employeeState");
            return (Criteria) this;
        }

        public Criteria andEmployeeStateLessThanOrEqualTo(String value) {
            addCriterion("Employee_State <=", value, "employeeState");
            return (Criteria) this;
        }

        public Criteria andEmployeeStateLike(String value) {
            addCriterion("Employee_State like", value, "employeeState");
            return (Criteria) this;
        }

        public Criteria andEmployeeStateNotLike(String value) {
            addCriterion("Employee_State not like", value, "employeeState");
            return (Criteria) this;
        }

        public Criteria andEmployeeStateIn(List<String> values) {
            addCriterion("Employee_State in", values, "employeeState");
            return (Criteria) this;
        }

        public Criteria andEmployeeStateNotIn(List<String> values) {
            addCriterion("Employee_State not in", values, "employeeState");
            return (Criteria) this;
        }

        public Criteria andEmployeeStateBetween(String value1, String value2) {
            addCriterion("Employee_State between", value1, value2, "employeeState");
            return (Criteria) this;
        }

        public Criteria andEmployeeStateNotBetween(String value1, String value2) {
            addCriterion("Employee_State not between", value1, value2, "employeeState");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNull() {
            addCriterion("Phone is null");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNotNull() {
            addCriterion("Phone is not null");
            return (Criteria) this;
        }

        public Criteria andPhoneEqualTo(String value) {
            addCriterion("Phone =", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotEqualTo(String value) {
            addCriterion("Phone <>", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThan(String value) {
            addCriterion("Phone >", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("Phone >=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThan(String value) {
            addCriterion("Phone <", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThanOrEqualTo(String value) {
            addCriterion("Phone <=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLike(String value) {
            addCriterion("Phone like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotLike(String value) {
            addCriterion("Phone not like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneIn(List<String> values) {
            addCriterion("Phone in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotIn(List<String> values) {
            addCriterion("Phone not in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneBetween(String value1, String value2) {
            addCriterion("Phone between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotBetween(String value1, String value2) {
            addCriterion("Phone not between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andAddressIsNull() {
            addCriterion("Address is null");
            return (Criteria) this;
        }

        public Criteria andAddressIsNotNull() {
            addCriterion("Address is not null");
            return (Criteria) this;
        }

        public Criteria andAddressEqualTo(String value) {
            addCriterion("Address =", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotEqualTo(String value) {
            addCriterion("Address <>", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThan(String value) {
            addCriterion("Address >", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThanOrEqualTo(String value) {
            addCriterion("Address >=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThan(String value) {
            addCriterion("Address <", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThanOrEqualTo(String value) {
            addCriterion("Address <=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLike(String value) {
            addCriterion("Address like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotLike(String value) {
            addCriterion("Address not like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressIn(List<String> values) {
            addCriterion("Address in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotIn(List<String> values) {
            addCriterion("Address not in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressBetween(String value1, String value2) {
            addCriterion("Address between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotBetween(String value1, String value2) {
            addCriterion("Address not between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andEmployeeMemoIsNull() {
            addCriterion("Employee_Memo is null");
            return (Criteria) this;
        }

        public Criteria andEmployeeMemoIsNotNull() {
            addCriterion("Employee_Memo is not null");
            return (Criteria) this;
        }

        public Criteria andEmployeeMemoEqualTo(String value) {
            addCriterion("Employee_Memo =", value, "employeeMemo");
            return (Criteria) this;
        }

        public Criteria andEmployeeMemoNotEqualTo(String value) {
            addCriterion("Employee_Memo <>", value, "employeeMemo");
            return (Criteria) this;
        }

        public Criteria andEmployeeMemoGreaterThan(String value) {
            addCriterion("Employee_Memo >", value, "employeeMemo");
            return (Criteria) this;
        }

        public Criteria andEmployeeMemoGreaterThanOrEqualTo(String value) {
            addCriterion("Employee_Memo >=", value, "employeeMemo");
            return (Criteria) this;
        }

        public Criteria andEmployeeMemoLessThan(String value) {
            addCriterion("Employee_Memo <", value, "employeeMemo");
            return (Criteria) this;
        }

        public Criteria andEmployeeMemoLessThanOrEqualTo(String value) {
            addCriterion("Employee_Memo <=", value, "employeeMemo");
            return (Criteria) this;
        }

        public Criteria andEmployeeMemoLike(String value) {
            addCriterion("Employee_Memo like", value, "employeeMemo");
            return (Criteria) this;
        }

        public Criteria andEmployeeMemoNotLike(String value) {
            addCriterion("Employee_Memo not like", value, "employeeMemo");
            return (Criteria) this;
        }

        public Criteria andEmployeeMemoIn(List<String> values) {
            addCriterion("Employee_Memo in", values, "employeeMemo");
            return (Criteria) this;
        }

        public Criteria andEmployeeMemoNotIn(List<String> values) {
            addCriterion("Employee_Memo not in", values, "employeeMemo");
            return (Criteria) this;
        }

        public Criteria andEmployeeMemoBetween(String value1, String value2) {
            addCriterion("Employee_Memo between", value1, value2, "employeeMemo");
            return (Criteria) this;
        }

        public Criteria andEmployeeMemoNotBetween(String value1, String value2) {
            addCriterion("Employee_Memo not between", value1, value2, "employeeMemo");
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