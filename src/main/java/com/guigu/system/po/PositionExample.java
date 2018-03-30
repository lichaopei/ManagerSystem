package com.guigu.system.po;

import java.util.ArrayList;
import java.util.List;

public class PositionExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PositionExample() {
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

        public Criteria andPositionIdIsNull() {
            addCriterion("Position_Id is null");
            return (Criteria) this;
        }

        public Criteria andPositionIdIsNotNull() {
            addCriterion("Position_Id is not null");
            return (Criteria) this;
        }

        public Criteria andPositionIdEqualTo(Integer value) {
            addCriterion("Position_Id =", value, "positionId");
            return (Criteria) this;
        }

        public Criteria andPositionIdNotEqualTo(Integer value) {
            addCriterion("Position_Id <>", value, "positionId");
            return (Criteria) this;
        }

        public Criteria andPositionIdGreaterThan(Integer value) {
            addCriterion("Position_Id >", value, "positionId");
            return (Criteria) this;
        }

        public Criteria andPositionIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("Position_Id >=", value, "positionId");
            return (Criteria) this;
        }

        public Criteria andPositionIdLessThan(Integer value) {
            addCriterion("Position_Id <", value, "positionId");
            return (Criteria) this;
        }

        public Criteria andPositionIdLessThanOrEqualTo(Integer value) {
            addCriterion("Position_Id <=", value, "positionId");
            return (Criteria) this;
        }

        public Criteria andPositionIdIn(List<Integer> values) {
            addCriterion("Position_Id in", values, "positionId");
            return (Criteria) this;
        }

        public Criteria andPositionIdNotIn(List<Integer> values) {
            addCriterion("Position_Id not in", values, "positionId");
            return (Criteria) this;
        }

        public Criteria andPositionIdBetween(Integer value1, Integer value2) {
            addCriterion("Position_Id between", value1, value2, "positionId");
            return (Criteria) this;
        }

        public Criteria andPositionIdNotBetween(Integer value1, Integer value2) {
            addCriterion("Position_Id not between", value1, value2, "positionId");
            return (Criteria) this;
        }

        public Criteria andPositionNameIsNull() {
            addCriterion("Position_Name is null");
            return (Criteria) this;
        }

        public Criteria andPositionNameIsNotNull() {
            addCriterion("Position_Name is not null");
            return (Criteria) this;
        }

        public Criteria andPositionNameEqualTo(String value) {
            addCriterion("Position_Name =", value, "positionName");
            return (Criteria) this;
        }

        public Criteria andPositionNameNotEqualTo(String value) {
            addCriterion("Position_Name <>", value, "positionName");
            return (Criteria) this;
        }

        public Criteria andPositionNameGreaterThan(String value) {
            addCriterion("Position_Name >", value, "positionName");
            return (Criteria) this;
        }

        public Criteria andPositionNameGreaterThanOrEqualTo(String value) {
            addCriterion("Position_Name >=", value, "positionName");
            return (Criteria) this;
        }

        public Criteria andPositionNameLessThan(String value) {
            addCriterion("Position_Name <", value, "positionName");
            return (Criteria) this;
        }

        public Criteria andPositionNameLessThanOrEqualTo(String value) {
            addCriterion("Position_Name <=", value, "positionName");
            return (Criteria) this;
        }

        public Criteria andPositionNameLike(String value) {
            addCriterion("Position_Name like", value, "positionName");
            return (Criteria) this;
        }

        public Criteria andPositionNameNotLike(String value) {
            addCriterion("Position_Name not like", value, "positionName");
            return (Criteria) this;
        }

        public Criteria andPositionNameIn(List<String> values) {
            addCriterion("Position_Name in", values, "positionName");
            return (Criteria) this;
        }

        public Criteria andPositionNameNotIn(List<String> values) {
            addCriterion("Position_Name not in", values, "positionName");
            return (Criteria) this;
        }

        public Criteria andPositionNameBetween(String value1, String value2) {
            addCriterion("Position_Name between", value1, value2, "positionName");
            return (Criteria) this;
        }

        public Criteria andPositionNameNotBetween(String value1, String value2) {
            addCriterion("Position_Name not between", value1, value2, "positionName");
            return (Criteria) this;
        }

        public Criteria andPositionMemoIsNull() {
            addCriterion("Position_Memo is null");
            return (Criteria) this;
        }

        public Criteria andPositionMemoIsNotNull() {
            addCriterion("Position_Memo is not null");
            return (Criteria) this;
        }

        public Criteria andPositionMemoEqualTo(String value) {
            addCriterion("Position_Memo =", value, "positionMemo");
            return (Criteria) this;
        }

        public Criteria andPositionMemoNotEqualTo(String value) {
            addCriterion("Position_Memo <>", value, "positionMemo");
            return (Criteria) this;
        }

        public Criteria andPositionMemoGreaterThan(String value) {
            addCriterion("Position_Memo >", value, "positionMemo");
            return (Criteria) this;
        }

        public Criteria andPositionMemoGreaterThanOrEqualTo(String value) {
            addCriterion("Position_Memo >=", value, "positionMemo");
            return (Criteria) this;
        }

        public Criteria andPositionMemoLessThan(String value) {
            addCriterion("Position_Memo <", value, "positionMemo");
            return (Criteria) this;
        }

        public Criteria andPositionMemoLessThanOrEqualTo(String value) {
            addCriterion("Position_Memo <=", value, "positionMemo");
            return (Criteria) this;
        }

        public Criteria andPositionMemoLike(String value) {
            addCriterion("Position_Memo like", value, "positionMemo");
            return (Criteria) this;
        }

        public Criteria andPositionMemoNotLike(String value) {
            addCriterion("Position_Memo not like", value, "positionMemo");
            return (Criteria) this;
        }

        public Criteria andPositionMemoIn(List<String> values) {
            addCriterion("Position_Memo in", values, "positionMemo");
            return (Criteria) this;
        }

        public Criteria andPositionMemoNotIn(List<String> values) {
            addCriterion("Position_Memo not in", values, "positionMemo");
            return (Criteria) this;
        }

        public Criteria andPositionMemoBetween(String value1, String value2) {
            addCriterion("Position_Memo between", value1, value2, "positionMemo");
            return (Criteria) this;
        }

        public Criteria andPositionMemoNotBetween(String value1, String value2) {
            addCriterion("Position_Memo not between", value1, value2, "positionMemo");
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