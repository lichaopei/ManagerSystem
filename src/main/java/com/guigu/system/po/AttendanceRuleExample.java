package com.guigu.system.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class AttendanceRuleExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AttendanceRuleExample() {
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

        protected void addCriterionForJDBCTime(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Time(value.getTime()), property);
        }

        protected void addCriterionForJDBCTime(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Time> timeList = new ArrayList<java.sql.Time>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                timeList.add(new java.sql.Time(iter.next().getTime()));
            }
            addCriterion(condition, timeList, property);
        }

        protected void addCriterionForJDBCTime(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Time(value1.getTime()), new java.sql.Time(value2.getTime()), property);
        }

        public Criteria andRuleIdIsNull() {
            addCriterion("Rule_ID is null");
            return (Criteria) this;
        }

        public Criteria andRuleIdIsNotNull() {
            addCriterion("Rule_ID is not null");
            return (Criteria) this;
        }

        public Criteria andRuleIdEqualTo(Integer value) {
            addCriterion("Rule_ID =", value, "ruleId");
            return (Criteria) this;
        }

        public Criteria andRuleIdNotEqualTo(Integer value) {
            addCriterion("Rule_ID <>", value, "ruleId");
            return (Criteria) this;
        }

        public Criteria andRuleIdGreaterThan(Integer value) {
            addCriterion("Rule_ID >", value, "ruleId");
            return (Criteria) this;
        }

        public Criteria andRuleIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("Rule_ID >=", value, "ruleId");
            return (Criteria) this;
        }

        public Criteria andRuleIdLessThan(Integer value) {
            addCriterion("Rule_ID <", value, "ruleId");
            return (Criteria) this;
        }

        public Criteria andRuleIdLessThanOrEqualTo(Integer value) {
            addCriterion("Rule_ID <=", value, "ruleId");
            return (Criteria) this;
        }

        public Criteria andRuleIdIn(List<Integer> values) {
            addCriterion("Rule_ID in", values, "ruleId");
            return (Criteria) this;
        }

        public Criteria andRuleIdNotIn(List<Integer> values) {
            addCriterion("Rule_ID not in", values, "ruleId");
            return (Criteria) this;
        }

        public Criteria andRuleIdBetween(Integer value1, Integer value2) {
            addCriterion("Rule_ID between", value1, value2, "ruleId");
            return (Criteria) this;
        }

        public Criteria andRuleIdNotBetween(Integer value1, Integer value2) {
            addCriterion("Rule_ID not between", value1, value2, "ruleId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdIsNull() {
            addCriterion("Department_ID is null");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdIsNotNull() {
            addCriterion("Department_ID is not null");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdEqualTo(Integer value) {
            addCriterion("Department_ID =", value, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdNotEqualTo(Integer value) {
            addCriterion("Department_ID <>", value, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdGreaterThan(Integer value) {
            addCriterion("Department_ID >", value, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("Department_ID >=", value, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdLessThan(Integer value) {
            addCriterion("Department_ID <", value, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdLessThanOrEqualTo(Integer value) {
            addCriterion("Department_ID <=", value, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdIn(List<Integer> values) {
            addCriterion("Department_ID in", values, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdNotIn(List<Integer> values) {
            addCriterion("Department_ID not in", values, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdBetween(Integer value1, Integer value2) {
            addCriterion("Department_ID between", value1, value2, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdNotBetween(Integer value1, Integer value2) {
            addCriterion("Department_ID not between", value1, value2, "departmentId");
            return (Criteria) this;
        }

        public Criteria andStartTimeAmIsNull() {
            addCriterion("Start_Time_AM is null");
            return (Criteria) this;
        }

        public Criteria andStartTimeAmIsNotNull() {
            addCriterion("Start_Time_AM is not null");
            return (Criteria) this;
        }

        public Criteria andStartTimeAmEqualTo(Date value) {
            addCriterionForJDBCTime("Start_Time_AM =", value, "startTimeAm");
            return (Criteria) this;
        }

        public Criteria andStartTimeAmNotEqualTo(Date value) {
            addCriterionForJDBCTime("Start_Time_AM <>", value, "startTimeAm");
            return (Criteria) this;
        }

        public Criteria andStartTimeAmGreaterThan(Date value) {
            addCriterionForJDBCTime("Start_Time_AM >", value, "startTimeAm");
            return (Criteria) this;
        }

        public Criteria andStartTimeAmGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCTime("Start_Time_AM >=", value, "startTimeAm");
            return (Criteria) this;
        }

        public Criteria andStartTimeAmLessThan(Date value) {
            addCriterionForJDBCTime("Start_Time_AM <", value, "startTimeAm");
            return (Criteria) this;
        }

        public Criteria andStartTimeAmLessThanOrEqualTo(Date value) {
            addCriterionForJDBCTime("Start_Time_AM <=", value, "startTimeAm");
            return (Criteria) this;
        }

        public Criteria andStartTimeAmIn(List<Date> values) {
            addCriterionForJDBCTime("Start_Time_AM in", values, "startTimeAm");
            return (Criteria) this;
        }

        public Criteria andStartTimeAmNotIn(List<Date> values) {
            addCriterionForJDBCTime("Start_Time_AM not in", values, "startTimeAm");
            return (Criteria) this;
        }

        public Criteria andStartTimeAmBetween(Date value1, Date value2) {
            addCriterionForJDBCTime("Start_Time_AM between", value1, value2, "startTimeAm");
            return (Criteria) this;
        }

        public Criteria andStartTimeAmNotBetween(Date value1, Date value2) {
            addCriterionForJDBCTime("Start_Time_AM not between", value1, value2, "startTimeAm");
            return (Criteria) this;
        }

        public Criteria andEndTimeAmIsNull() {
            addCriterion("End_Time_AM is null");
            return (Criteria) this;
        }

        public Criteria andEndTimeAmIsNotNull() {
            addCriterion("End_Time_AM is not null");
            return (Criteria) this;
        }

        public Criteria andEndTimeAmEqualTo(Date value) {
            addCriterionForJDBCTime("End_Time_AM =", value, "endTimeAm");
            return (Criteria) this;
        }

        public Criteria andEndTimeAmNotEqualTo(Date value) {
            addCriterionForJDBCTime("End_Time_AM <>", value, "endTimeAm");
            return (Criteria) this;
        }

        public Criteria andEndTimeAmGreaterThan(Date value) {
            addCriterionForJDBCTime("End_Time_AM >", value, "endTimeAm");
            return (Criteria) this;
        }

        public Criteria andEndTimeAmGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCTime("End_Time_AM >=", value, "endTimeAm");
            return (Criteria) this;
        }

        public Criteria andEndTimeAmLessThan(Date value) {
            addCriterionForJDBCTime("End_Time_AM <", value, "endTimeAm");
            return (Criteria) this;
        }

        public Criteria andEndTimeAmLessThanOrEqualTo(Date value) {
            addCriterionForJDBCTime("End_Time_AM <=", value, "endTimeAm");
            return (Criteria) this;
        }

        public Criteria andEndTimeAmIn(List<Date> values) {
            addCriterionForJDBCTime("End_Time_AM in", values, "endTimeAm");
            return (Criteria) this;
        }

        public Criteria andEndTimeAmNotIn(List<Date> values) {
            addCriterionForJDBCTime("End_Time_AM not in", values, "endTimeAm");
            return (Criteria) this;
        }

        public Criteria andEndTimeAmBetween(Date value1, Date value2) {
            addCriterionForJDBCTime("End_Time_AM between", value1, value2, "endTimeAm");
            return (Criteria) this;
        }

        public Criteria andEndTimeAmNotBetween(Date value1, Date value2) {
            addCriterionForJDBCTime("End_Time_AM not between", value1, value2, "endTimeAm");
            return (Criteria) this;
        }

        public Criteria andStartTimePmIsNull() {
            addCriterion("Start_Time_PM is null");
            return (Criteria) this;
        }

        public Criteria andStartTimePmIsNotNull() {
            addCriterion("Start_Time_PM is not null");
            return (Criteria) this;
        }

        public Criteria andStartTimePmEqualTo(Date value) {
            addCriterionForJDBCTime("Start_Time_PM =", value, "startTimePm");
            return (Criteria) this;
        }

        public Criteria andStartTimePmNotEqualTo(Date value) {
            addCriterionForJDBCTime("Start_Time_PM <>", value, "startTimePm");
            return (Criteria) this;
        }

        public Criteria andStartTimePmGreaterThan(Date value) {
            addCriterionForJDBCTime("Start_Time_PM >", value, "startTimePm");
            return (Criteria) this;
        }

        public Criteria andStartTimePmGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCTime("Start_Time_PM >=", value, "startTimePm");
            return (Criteria) this;
        }

        public Criteria andStartTimePmLessThan(Date value) {
            addCriterionForJDBCTime("Start_Time_PM <", value, "startTimePm");
            return (Criteria) this;
        }

        public Criteria andStartTimePmLessThanOrEqualTo(Date value) {
            addCriterionForJDBCTime("Start_Time_PM <=", value, "startTimePm");
            return (Criteria) this;
        }

        public Criteria andStartTimePmIn(List<Date> values) {
            addCriterionForJDBCTime("Start_Time_PM in", values, "startTimePm");
            return (Criteria) this;
        }

        public Criteria andStartTimePmNotIn(List<Date> values) {
            addCriterionForJDBCTime("Start_Time_PM not in", values, "startTimePm");
            return (Criteria) this;
        }

        public Criteria andStartTimePmBetween(Date value1, Date value2) {
            addCriterionForJDBCTime("Start_Time_PM between", value1, value2, "startTimePm");
            return (Criteria) this;
        }

        public Criteria andStartTimePmNotBetween(Date value1, Date value2) {
            addCriterionForJDBCTime("Start_Time_PM not between", value1, value2, "startTimePm");
            return (Criteria) this;
        }

        public Criteria andEndTimePmIsNull() {
            addCriterion("End_Time_PM is null");
            return (Criteria) this;
        }

        public Criteria andEndTimePmIsNotNull() {
            addCriterion("End_Time_PM is not null");
            return (Criteria) this;
        }

        public Criteria andEndTimePmEqualTo(Date value) {
            addCriterionForJDBCTime("End_Time_PM =", value, "endTimePm");
            return (Criteria) this;
        }

        public Criteria andEndTimePmNotEqualTo(Date value) {
            addCriterionForJDBCTime("End_Time_PM <>", value, "endTimePm");
            return (Criteria) this;
        }

        public Criteria andEndTimePmGreaterThan(Date value) {
            addCriterionForJDBCTime("End_Time_PM >", value, "endTimePm");
            return (Criteria) this;
        }

        public Criteria andEndTimePmGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCTime("End_Time_PM >=", value, "endTimePm");
            return (Criteria) this;
        }

        public Criteria andEndTimePmLessThan(Date value) {
            addCriterionForJDBCTime("End_Time_PM <", value, "endTimePm");
            return (Criteria) this;
        }

        public Criteria andEndTimePmLessThanOrEqualTo(Date value) {
            addCriterionForJDBCTime("End_Time_PM <=", value, "endTimePm");
            return (Criteria) this;
        }

        public Criteria andEndTimePmIn(List<Date> values) {
            addCriterionForJDBCTime("End_Time_PM in", values, "endTimePm");
            return (Criteria) this;
        }

        public Criteria andEndTimePmNotIn(List<Date> values) {
            addCriterionForJDBCTime("End_Time_PM not in", values, "endTimePm");
            return (Criteria) this;
        }

        public Criteria andEndTimePmBetween(Date value1, Date value2) {
            addCriterionForJDBCTime("End_Time_PM between", value1, value2, "endTimePm");
            return (Criteria) this;
        }

        public Criteria andEndTimePmNotBetween(Date value1, Date value2) {
            addCriterionForJDBCTime("End_Time_PM not between", value1, value2, "endTimePm");
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