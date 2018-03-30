package com.guigu.system.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OvertimeRecordExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OvertimeRecordExample() {
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

        public Criteria andOvertimeIdIsNull() {
            addCriterion("OverTime_ID is null");
            return (Criteria) this;
        }

        public Criteria andOvertimeIdIsNotNull() {
            addCriterion("OverTime_ID is not null");
            return (Criteria) this;
        }

        public Criteria andOvertimeIdEqualTo(Integer value) {
            addCriterion("OverTime_ID =", value, "overtimeId");
            return (Criteria) this;
        }

        public Criteria andOvertimeIdNotEqualTo(Integer value) {
            addCriterion("OverTime_ID <>", value, "overtimeId");
            return (Criteria) this;
        }

        public Criteria andOvertimeIdGreaterThan(Integer value) {
            addCriterion("OverTime_ID >", value, "overtimeId");
            return (Criteria) this;
        }

        public Criteria andOvertimeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("OverTime_ID >=", value, "overtimeId");
            return (Criteria) this;
        }

        public Criteria andOvertimeIdLessThan(Integer value) {
            addCriterion("OverTime_ID <", value, "overtimeId");
            return (Criteria) this;
        }

        public Criteria andOvertimeIdLessThanOrEqualTo(Integer value) {
            addCriterion("OverTime_ID <=", value, "overtimeId");
            return (Criteria) this;
        }

        public Criteria andOvertimeIdIn(List<Integer> values) {
            addCriterion("OverTime_ID in", values, "overtimeId");
            return (Criteria) this;
        }

        public Criteria andOvertimeIdNotIn(List<Integer> values) {
            addCriterion("OverTime_ID not in", values, "overtimeId");
            return (Criteria) this;
        }

        public Criteria andOvertimeIdBetween(Integer value1, Integer value2) {
            addCriterion("OverTime_ID between", value1, value2, "overtimeId");
            return (Criteria) this;
        }

        public Criteria andOvertimeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("OverTime_ID not between", value1, value2, "overtimeId");
            return (Criteria) this;
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

        public Criteria andOvertimeDateIsNull() {
            addCriterion("Overtime_Date is null");
            return (Criteria) this;
        }

        public Criteria andOvertimeDateIsNotNull() {
            addCriterion("Overtime_Date is not null");
            return (Criteria) this;
        }

        public Criteria andOvertimeDateEqualTo(Date value) {
            addCriterion("Overtime_Date =", value, "overtimeDate");
            return (Criteria) this;
        }

        public Criteria andOvertimeDateNotEqualTo(Date value) {
            addCriterion("Overtime_Date <>", value, "overtimeDate");
            return (Criteria) this;
        }

        public Criteria andOvertimeDateGreaterThan(Date value) {
            addCriterion("Overtime_Date >", value, "overtimeDate");
            return (Criteria) this;
        }

        public Criteria andOvertimeDateGreaterThanOrEqualTo(Date value) {
            addCriterion("Overtime_Date >=", value, "overtimeDate");
            return (Criteria) this;
        }

        public Criteria andOvertimeDateLessThan(Date value) {
            addCriterion("Overtime_Date <", value, "overtimeDate");
            return (Criteria) this;
        }

        public Criteria andOvertimeDateLessThanOrEqualTo(Date value) {
            addCriterion("Overtime_Date <=", value, "overtimeDate");
            return (Criteria) this;
        }

        public Criteria andOvertimeDateIn(List<Date> values) {
            addCriterion("Overtime_Date in", values, "overtimeDate");
            return (Criteria) this;
        }

        public Criteria andOvertimeDateNotIn(List<Date> values) {
            addCriterion("Overtime_Date not in", values, "overtimeDate");
            return (Criteria) this;
        }

        public Criteria andOvertimeDateBetween(Date value1, Date value2) {
            addCriterion("Overtime_Date between", value1, value2, "overtimeDate");
            return (Criteria) this;
        }

        public Criteria andOvertimeDateNotBetween(Date value1, Date value2) {
            addCriterion("Overtime_Date not between", value1, value2, "overtimeDate");
            return (Criteria) this;
        }

        public Criteria andOvertimeFlagIsNull() {
            addCriterion("Overtime_Flag is null");
            return (Criteria) this;
        }

        public Criteria andOvertimeFlagIsNotNull() {
            addCriterion("Overtime_Flag is not null");
            return (Criteria) this;
        }

        public Criteria andOvertimeFlagEqualTo(String value) {
            addCriterion("Overtime_Flag =", value, "overtimeFlag");
            return (Criteria) this;
        }

        public Criteria andOvertimeFlagNotEqualTo(String value) {
            addCriterion("Overtime_Flag <>", value, "overtimeFlag");
            return (Criteria) this;
        }

        public Criteria andOvertimeFlagGreaterThan(String value) {
            addCriterion("Overtime_Flag >", value, "overtimeFlag");
            return (Criteria) this;
        }

        public Criteria andOvertimeFlagGreaterThanOrEqualTo(String value) {
            addCriterion("Overtime_Flag >=", value, "overtimeFlag");
            return (Criteria) this;
        }

        public Criteria andOvertimeFlagLessThan(String value) {
            addCriterion("Overtime_Flag <", value, "overtimeFlag");
            return (Criteria) this;
        }

        public Criteria andOvertimeFlagLessThanOrEqualTo(String value) {
            addCriterion("Overtime_Flag <=", value, "overtimeFlag");
            return (Criteria) this;
        }

        public Criteria andOvertimeFlagLike(String value) {
            addCriterion("Overtime_Flag like", value, "overtimeFlag");
            return (Criteria) this;
        }

        public Criteria andOvertimeFlagNotLike(String value) {
            addCriterion("Overtime_Flag not like", value, "overtimeFlag");
            return (Criteria) this;
        }

        public Criteria andOvertimeFlagIn(List<String> values) {
            addCriterion("Overtime_Flag in", values, "overtimeFlag");
            return (Criteria) this;
        }

        public Criteria andOvertimeFlagNotIn(List<String> values) {
            addCriterion("Overtime_Flag not in", values, "overtimeFlag");
            return (Criteria) this;
        }

        public Criteria andOvertimeFlagBetween(String value1, String value2) {
            addCriterion("Overtime_Flag between", value1, value2, "overtimeFlag");
            return (Criteria) this;
        }

        public Criteria andOvertimeFlagNotBetween(String value1, String value2) {
            addCriterion("Overtime_Flag not between", value1, value2, "overtimeFlag");
            return (Criteria) this;
        }

        public Criteria andOvertimeStateIsNull() {
            addCriterion("Overtime_State is null");
            return (Criteria) this;
        }

        public Criteria andOvertimeStateIsNotNull() {
            addCriterion("Overtime_State is not null");
            return (Criteria) this;
        }

        public Criteria andOvertimeStateEqualTo(String value) {
            addCriterion("Overtime_State =", value, "overtimeState");
            return (Criteria) this;
        }

        public Criteria andOvertimeStateNotEqualTo(String value) {
            addCriterion("Overtime_State <>", value, "overtimeState");
            return (Criteria) this;
        }

        public Criteria andOvertimeStateGreaterThan(String value) {
            addCriterion("Overtime_State >", value, "overtimeState");
            return (Criteria) this;
        }

        public Criteria andOvertimeStateGreaterThanOrEqualTo(String value) {
            addCriterion("Overtime_State >=", value, "overtimeState");
            return (Criteria) this;
        }

        public Criteria andOvertimeStateLessThan(String value) {
            addCriterion("Overtime_State <", value, "overtimeState");
            return (Criteria) this;
        }

        public Criteria andOvertimeStateLessThanOrEqualTo(String value) {
            addCriterion("Overtime_State <=", value, "overtimeState");
            return (Criteria) this;
        }

        public Criteria andOvertimeStateLike(String value) {
            addCriterion("Overtime_State like", value, "overtimeState");
            return (Criteria) this;
        }

        public Criteria andOvertimeStateNotLike(String value) {
            addCriterion("Overtime_State not like", value, "overtimeState");
            return (Criteria) this;
        }

        public Criteria andOvertimeStateIn(List<String> values) {
            addCriterion("Overtime_State in", values, "overtimeState");
            return (Criteria) this;
        }

        public Criteria andOvertimeStateNotIn(List<String> values) {
            addCriterion("Overtime_State not in", values, "overtimeState");
            return (Criteria) this;
        }

        public Criteria andOvertimeStateBetween(String value1, String value2) {
            addCriterion("Overtime_State between", value1, value2, "overtimeState");
            return (Criteria) this;
        }

        public Criteria andOvertimeStateNotBetween(String value1, String value2) {
            addCriterion("Overtime_State not between", value1, value2, "overtimeState");
            return (Criteria) this;
        }

        public Criteria andIsVerifyIsNull() {
            addCriterion("Is_Verify is null");
            return (Criteria) this;
        }

        public Criteria andIsVerifyIsNotNull() {
            addCriterion("Is_Verify is not null");
            return (Criteria) this;
        }

        public Criteria andIsVerifyEqualTo(Boolean value) {
            addCriterion("Is_Verify =", value, "isVerify");
            return (Criteria) this;
        }

        public Criteria andIsVerifyNotEqualTo(Boolean value) {
            addCriterion("Is_Verify <>", value, "isVerify");
            return (Criteria) this;
        }

        public Criteria andIsVerifyGreaterThan(Boolean value) {
            addCriterion("Is_Verify >", value, "isVerify");
            return (Criteria) this;
        }

        public Criteria andIsVerifyGreaterThanOrEqualTo(Boolean value) {
            addCriterion("Is_Verify >=", value, "isVerify");
            return (Criteria) this;
        }

        public Criteria andIsVerifyLessThan(Boolean value) {
            addCriterion("Is_Verify <", value, "isVerify");
            return (Criteria) this;
        }

        public Criteria andIsVerifyLessThanOrEqualTo(Boolean value) {
            addCriterion("Is_Verify <=", value, "isVerify");
            return (Criteria) this;
        }

        public Criteria andIsVerifyIn(List<Boolean> values) {
            addCriterion("Is_Verify in", values, "isVerify");
            return (Criteria) this;
        }

        public Criteria andIsVerifyNotIn(List<Boolean> values) {
            addCriterion("Is_Verify not in", values, "isVerify");
            return (Criteria) this;
        }

        public Criteria andIsVerifyBetween(Boolean value1, Boolean value2) {
            addCriterion("Is_Verify between", value1, value2, "isVerify");
            return (Criteria) this;
        }

        public Criteria andIsVerifyNotBetween(Boolean value1, Boolean value2) {
            addCriterion("Is_Verify not between", value1, value2, "isVerify");
            return (Criteria) this;
        }

        public Criteria andOvertimeMemoIsNull() {
            addCriterion("Overtime_Memo is null");
            return (Criteria) this;
        }

        public Criteria andOvertimeMemoIsNotNull() {
            addCriterion("Overtime_Memo is not null");
            return (Criteria) this;
        }

        public Criteria andOvertimeMemoEqualTo(String value) {
            addCriterion("Overtime_Memo =", value, "overtimeMemo");
            return (Criteria) this;
        }

        public Criteria andOvertimeMemoNotEqualTo(String value) {
            addCriterion("Overtime_Memo <>", value, "overtimeMemo");
            return (Criteria) this;
        }

        public Criteria andOvertimeMemoGreaterThan(String value) {
            addCriterion("Overtime_Memo >", value, "overtimeMemo");
            return (Criteria) this;
        }

        public Criteria andOvertimeMemoGreaterThanOrEqualTo(String value) {
            addCriterion("Overtime_Memo >=", value, "overtimeMemo");
            return (Criteria) this;
        }

        public Criteria andOvertimeMemoLessThan(String value) {
            addCriterion("Overtime_Memo <", value, "overtimeMemo");
            return (Criteria) this;
        }

        public Criteria andOvertimeMemoLessThanOrEqualTo(String value) {
            addCriterion("Overtime_Memo <=", value, "overtimeMemo");
            return (Criteria) this;
        }

        public Criteria andOvertimeMemoLike(String value) {
            addCriterion("Overtime_Memo like", value, "overtimeMemo");
            return (Criteria) this;
        }

        public Criteria andOvertimeMemoNotLike(String value) {
            addCriterion("Overtime_Memo not like", value, "overtimeMemo");
            return (Criteria) this;
        }

        public Criteria andOvertimeMemoIn(List<String> values) {
            addCriterion("Overtime_Memo in", values, "overtimeMemo");
            return (Criteria) this;
        }

        public Criteria andOvertimeMemoNotIn(List<String> values) {
            addCriterion("Overtime_Memo not in", values, "overtimeMemo");
            return (Criteria) this;
        }

        public Criteria andOvertimeMemoBetween(String value1, String value2) {
            addCriterion("Overtime_Memo between", value1, value2, "overtimeMemo");
            return (Criteria) this;
        }

        public Criteria andOvertimeMemoNotBetween(String value1, String value2) {
            addCriterion("Overtime_Memo not between", value1, value2, "overtimeMemo");
            return (Criteria) this;
        }

        public Criteria andOperatorIdIsNull() {
            addCriterion("Operator_ID is null");
            return (Criteria) this;
        }

        public Criteria andOperatorIdIsNotNull() {
            addCriterion("Operator_ID is not null");
            return (Criteria) this;
        }

        public Criteria andOperatorIdEqualTo(Integer value) {
            addCriterion("Operator_ID =", value, "operatorId");
            return (Criteria) this;
        }

        public Criteria andOperatorIdNotEqualTo(Integer value) {
            addCriterion("Operator_ID <>", value, "operatorId");
            return (Criteria) this;
        }

        public Criteria andOperatorIdGreaterThan(Integer value) {
            addCriterion("Operator_ID >", value, "operatorId");
            return (Criteria) this;
        }

        public Criteria andOperatorIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("Operator_ID >=", value, "operatorId");
            return (Criteria) this;
        }

        public Criteria andOperatorIdLessThan(Integer value) {
            addCriterion("Operator_ID <", value, "operatorId");
            return (Criteria) this;
        }

        public Criteria andOperatorIdLessThanOrEqualTo(Integer value) {
            addCriterion("Operator_ID <=", value, "operatorId");
            return (Criteria) this;
        }

        public Criteria andOperatorIdIn(List<Integer> values) {
            addCriterion("Operator_ID in", values, "operatorId");
            return (Criteria) this;
        }

        public Criteria andOperatorIdNotIn(List<Integer> values) {
            addCriterion("Operator_ID not in", values, "operatorId");
            return (Criteria) this;
        }

        public Criteria andOperatorIdBetween(Integer value1, Integer value2) {
            addCriterion("Operator_ID between", value1, value2, "operatorId");
            return (Criteria) this;
        }

        public Criteria andOperatorIdNotBetween(Integer value1, Integer value2) {
            addCriterion("Operator_ID not between", value1, value2, "operatorId");
            return (Criteria) this;
        }

        public Criteria andNoteIdIsNull() {
            addCriterion("Note_ID is null");
            return (Criteria) this;
        }

        public Criteria andNoteIdIsNotNull() {
            addCriterion("Note_ID is not null");
            return (Criteria) this;
        }

        public Criteria andNoteIdEqualTo(Integer value) {
            addCriterion("Note_ID =", value, "noteId");
            return (Criteria) this;
        }

        public Criteria andNoteIdNotEqualTo(Integer value) {
            addCriterion("Note_ID <>", value, "noteId");
            return (Criteria) this;
        }

        public Criteria andNoteIdGreaterThan(Integer value) {
            addCriterion("Note_ID >", value, "noteId");
            return (Criteria) this;
        }

        public Criteria andNoteIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("Note_ID >=", value, "noteId");
            return (Criteria) this;
        }

        public Criteria andNoteIdLessThan(Integer value) {
            addCriterion("Note_ID <", value, "noteId");
            return (Criteria) this;
        }

        public Criteria andNoteIdLessThanOrEqualTo(Integer value) {
            addCriterion("Note_ID <=", value, "noteId");
            return (Criteria) this;
        }

        public Criteria andNoteIdIn(List<Integer> values) {
            addCriterion("Note_ID in", values, "noteId");
            return (Criteria) this;
        }

        public Criteria andNoteIdNotIn(List<Integer> values) {
            addCriterion("Note_ID not in", values, "noteId");
            return (Criteria) this;
        }

        public Criteria andNoteIdBetween(Integer value1, Integer value2) {
            addCriterion("Note_ID between", value1, value2, "noteId");
            return (Criteria) this;
        }

        public Criteria andNoteIdNotBetween(Integer value1, Integer value2) {
            addCriterion("Note_ID not between", value1, value2, "noteId");
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