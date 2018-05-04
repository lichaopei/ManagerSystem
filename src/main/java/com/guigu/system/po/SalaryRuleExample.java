package com.guigu.system.po;

import java.util.ArrayList;
import java.util.List;

public class SalaryRuleExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SalaryRuleExample() {
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

        public Criteria andSalaryIdIsNull() {
            addCriterion("Salary_ID is null");
            return (Criteria) this;
        }

        public Criteria andSalaryIdIsNotNull() {
            addCriterion("Salary_ID is not null");
            return (Criteria) this;
        }

        public Criteria andSalaryIdEqualTo(Integer value) {
            addCriterion("Salary_ID =", value, "salaryId");
            return (Criteria) this;
        }

        public Criteria andSalaryIdNotEqualTo(Integer value) {
            addCriterion("Salary_ID <>", value, "salaryId");
            return (Criteria) this;
        }

        public Criteria andSalaryIdGreaterThan(Integer value) {
            addCriterion("Salary_ID >", value, "salaryId");
            return (Criteria) this;
        }

        public Criteria andSalaryIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("Salary_ID >=", value, "salaryId");
            return (Criteria) this;
        }

        public Criteria andSalaryIdLessThan(Integer value) {
            addCriterion("Salary_ID <", value, "salaryId");
            return (Criteria) this;
        }

        public Criteria andSalaryIdLessThanOrEqualTo(Integer value) {
            addCriterion("Salary_ID <=", value, "salaryId");
            return (Criteria) this;
        }

        public Criteria andSalaryIdIn(List<Integer> values) {
            addCriterion("Salary_ID in", values, "salaryId");
            return (Criteria) this;
        }

        public Criteria andSalaryIdNotIn(List<Integer> values) {
            addCriterion("Salary_ID not in", values, "salaryId");
            return (Criteria) this;
        }

        public Criteria andSalaryIdBetween(Integer value1, Integer value2) {
            addCriterion("Salary_ID between", value1, value2, "salaryId");
            return (Criteria) this;
        }

        public Criteria andSalaryIdNotBetween(Integer value1, Integer value2) {
            addCriterion("Salary_ID not between", value1, value2, "salaryId");
            return (Criteria) this;
        }

        public Criteria andPositionIdIsNull() {
            addCriterion("Position_ID is null");
            return (Criteria) this;
        }

        public Criteria andPositionIdIsNotNull() {
            addCriterion("Position_ID is not null");
            return (Criteria) this;
        }

        public Criteria andPositionIdEqualTo(Integer value) {
            addCriterion("Position_ID =", value, "positionId");
            return (Criteria) this;
        }

        public Criteria andPositionIdNotEqualTo(Integer value) {
            addCriterion("Position_ID <>", value, "positionId");
            return (Criteria) this;
        }

        public Criteria andPositionIdGreaterThan(Integer value) {
            addCriterion("Position_ID >", value, "positionId");
            return (Criteria) this;
        }

        public Criteria andPositionIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("Position_ID >=", value, "positionId");
            return (Criteria) this;
        }

        public Criteria andPositionIdLessThan(Integer value) {
            addCriterion("Position_ID <", value, "positionId");
            return (Criteria) this;
        }

        public Criteria andPositionIdLessThanOrEqualTo(Integer value) {
            addCriterion("Position_ID <=", value, "positionId");
            return (Criteria) this;
        }

        public Criteria andPositionIdIn(List<Integer> values) {
            addCriterion("Position_ID in", values, "positionId");
            return (Criteria) this;
        }

        public Criteria andPositionIdNotIn(List<Integer> values) {
            addCriterion("Position_ID not in", values, "positionId");
            return (Criteria) this;
        }

        public Criteria andPositionIdBetween(Integer value1, Integer value2) {
            addCriterion("Position_ID between", value1, value2, "positionId");
            return (Criteria) this;
        }

        public Criteria andPositionIdNotBetween(Integer value1, Integer value2) {
            addCriterion("Position_ID not between", value1, value2, "positionId");
            return (Criteria) this;
        }

        public Criteria andBaseSalaryIsNull() {
            addCriterion("Base_Salary is null");
            return (Criteria) this;
        }

        public Criteria andBaseSalaryIsNotNull() {
            addCriterion("Base_Salary is not null");
            return (Criteria) this;
        }

        public Criteria andBaseSalaryEqualTo(Double value) {
            addCriterion("Base_Salary =", value, "baseSalary");
            return (Criteria) this;
        }

        public Criteria andBaseSalaryNotEqualTo(Double value) {
            addCriterion("Base_Salary <>", value, "baseSalary");
            return (Criteria) this;
        }

        public Criteria andBaseSalaryGreaterThan(Double value) {
            addCriterion("Base_Salary >", value, "baseSalary");
            return (Criteria) this;
        }

        public Criteria andBaseSalaryGreaterThanOrEqualTo(Double value) {
            addCriterion("Base_Salary >=", value, "baseSalary");
            return (Criteria) this;
        }

        public Criteria andBaseSalaryLessThan(Double value) {
            addCriterion("Base_Salary <", value, "baseSalary");
            return (Criteria) this;
        }

        public Criteria andBaseSalaryLessThanOrEqualTo(Double value) {
            addCriterion("Base_Salary <=", value, "baseSalary");
            return (Criteria) this;
        }

        public Criteria andBaseSalaryIn(List<Double> values) {
            addCriterion("Base_Salary in", values, "baseSalary");
            return (Criteria) this;
        }

        public Criteria andBaseSalaryNotIn(List<Double> values) {
            addCriterion("Base_Salary not in", values, "baseSalary");
            return (Criteria) this;
        }

        public Criteria andBaseSalaryBetween(Double value1, Double value2) {
            addCriterion("Base_Salary between", value1, value2, "baseSalary");
            return (Criteria) this;
        }

        public Criteria andBaseSalaryNotBetween(Double value1, Double value2) {
            addCriterion("Base_Salary not between", value1, value2, "baseSalary");
            return (Criteria) this;
        }

        public Criteria andPositionSalaryIsNull() {
            addCriterion("Position_Salary is null");
            return (Criteria) this;
        }

        public Criteria andPositionSalaryIsNotNull() {
            addCriterion("Position_Salary is not null");
            return (Criteria) this;
        }

        public Criteria andPositionSalaryEqualTo(Double value) {
            addCriterion("Position_Salary =", value, "positionSalary");
            return (Criteria) this;
        }

        public Criteria andPositionSalaryNotEqualTo(Double value) {
            addCriterion("Position_Salary <>", value, "positionSalary");
            return (Criteria) this;
        }

        public Criteria andPositionSalaryGreaterThan(Double value) {
            addCriterion("Position_Salary >", value, "positionSalary");
            return (Criteria) this;
        }

        public Criteria andPositionSalaryGreaterThanOrEqualTo(Double value) {
            addCriterion("Position_Salary >=", value, "positionSalary");
            return (Criteria) this;
        }

        public Criteria andPositionSalaryLessThan(Double value) {
            addCriterion("Position_Salary <", value, "positionSalary");
            return (Criteria) this;
        }

        public Criteria andPositionSalaryLessThanOrEqualTo(Double value) {
            addCriterion("Position_Salary <=", value, "positionSalary");
            return (Criteria) this;
        }

        public Criteria andPositionSalaryIn(List<Double> values) {
            addCriterion("Position_Salary in", values, "positionSalary");
            return (Criteria) this;
        }

        public Criteria andPositionSalaryNotIn(List<Double> values) {
            addCriterion("Position_Salary not in", values, "positionSalary");
            return (Criteria) this;
        }

        public Criteria andPositionSalaryBetween(Double value1, Double value2) {
            addCriterion("Position_Salary between", value1, value2, "positionSalary");
            return (Criteria) this;
        }

        public Criteria andPositionSalaryNotBetween(Double value1, Double value2) {
            addCriterion("Position_Salary not between", value1, value2, "positionSalary");
            return (Criteria) this;
        }

        public Criteria andTargetMoneyIsNull() {
            addCriterion("Target_Money is null");
            return (Criteria) this;
        }

        public Criteria andTargetMoneyIsNotNull() {
            addCriterion("Target_Money is not null");
            return (Criteria) this;
        }

        public Criteria andTargetMoneyEqualTo(Double value) {
            addCriterion("Target_Money =", value, "targetMoney");
            return (Criteria) this;
        }

        public Criteria andTargetMoneyNotEqualTo(Double value) {
            addCriterion("Target_Money <>", value, "targetMoney");
            return (Criteria) this;
        }

        public Criteria andTargetMoneyGreaterThan(Double value) {
            addCriterion("Target_Money >", value, "targetMoney");
            return (Criteria) this;
        }

        public Criteria andTargetMoneyGreaterThanOrEqualTo(Double value) {
            addCriterion("Target_Money >=", value, "targetMoney");
            return (Criteria) this;
        }

        public Criteria andTargetMoneyLessThan(Double value) {
            addCriterion("Target_Money <", value, "targetMoney");
            return (Criteria) this;
        }

        public Criteria andTargetMoneyLessThanOrEqualTo(Double value) {
            addCriterion("Target_Money <=", value, "targetMoney");
            return (Criteria) this;
        }

        public Criteria andTargetMoneyIn(List<Double> values) {
            addCriterion("Target_Money in", values, "targetMoney");
            return (Criteria) this;
        }

        public Criteria andTargetMoneyNotIn(List<Double> values) {
            addCriterion("Target_Money not in", values, "targetMoney");
            return (Criteria) this;
        }

        public Criteria andTargetMoneyBetween(Double value1, Double value2) {
            addCriterion("Target_Money between", value1, value2, "targetMoney");
            return (Criteria) this;
        }

        public Criteria andTargetMoneyNotBetween(Double value1, Double value2) {
            addCriterion("Target_Money not between", value1, value2, "targetMoney");
            return (Criteria) this;
        }

        public Criteria andUpPercentIsNull() {
            addCriterion("Up_Percent is null");
            return (Criteria) this;
        }

        public Criteria andUpPercentIsNotNull() {
            addCriterion("Up_Percent is not null");
            return (Criteria) this;
        }

        public Criteria andUpPercentEqualTo(Double value) {
            addCriterion("Up_Percent =", value, "upPercent");
            return (Criteria) this;
        }

        public Criteria andUpPercentNotEqualTo(Double value) {
            addCriterion("Up_Percent <>", value, "upPercent");
            return (Criteria) this;
        }

        public Criteria andUpPercentGreaterThan(Double value) {
            addCriterion("Up_Percent >", value, "upPercent");
            return (Criteria) this;
        }

        public Criteria andUpPercentGreaterThanOrEqualTo(Double value) {
            addCriterion("Up_Percent >=", value, "upPercent");
            return (Criteria) this;
        }

        public Criteria andUpPercentLessThan(Double value) {
            addCriterion("Up_Percent <", value, "upPercent");
            return (Criteria) this;
        }

        public Criteria andUpPercentLessThanOrEqualTo(Double value) {
            addCriterion("Up_Percent <=", value, "upPercent");
            return (Criteria) this;
        }

        public Criteria andUpPercentIn(List<Double> values) {
            addCriterion("Up_Percent in", values, "upPercent");
            return (Criteria) this;
        }

        public Criteria andUpPercentNotIn(List<Double> values) {
            addCriterion("Up_Percent not in", values, "upPercent");
            return (Criteria) this;
        }

        public Criteria andUpPercentBetween(Double value1, Double value2) {
            addCriterion("Up_Percent between", value1, value2, "upPercent");
            return (Criteria) this;
        }

        public Criteria andUpPercentNotBetween(Double value1, Double value2) {
            addCriterion("Up_Percent not between", value1, value2, "upPercent");
            return (Criteria) this;
        }

        public Criteria andJxPercentIsNull() {
            addCriterion("Jx_Percent is null");
            return (Criteria) this;
        }

        public Criteria andJxPercentIsNotNull() {
            addCriterion("Jx_Percent is not null");
            return (Criteria) this;
        }

        public Criteria andJxPercentEqualTo(Double value) {
            addCriterion("Jx_Percent =", value, "jxPercent");
            return (Criteria) this;
        }

        public Criteria andJxPercentNotEqualTo(Double value) {
            addCriterion("Jx_Percent <>", value, "jxPercent");
            return (Criteria) this;
        }

        public Criteria andJxPercentGreaterThan(Double value) {
            addCriterion("Jx_Percent >", value, "jxPercent");
            return (Criteria) this;
        }

        public Criteria andJxPercentGreaterThanOrEqualTo(Double value) {
            addCriterion("Jx_Percent >=", value, "jxPercent");
            return (Criteria) this;
        }

        public Criteria andJxPercentLessThan(Double value) {
            addCriterion("Jx_Percent <", value, "jxPercent");
            return (Criteria) this;
        }

        public Criteria andJxPercentLessThanOrEqualTo(Double value) {
            addCriterion("Jx_Percent <=", value, "jxPercent");
            return (Criteria) this;
        }

        public Criteria andJxPercentIn(List<Double> values) {
            addCriterion("Jx_Percent in", values, "jxPercent");
            return (Criteria) this;
        }

        public Criteria andJxPercentNotIn(List<Double> values) {
            addCriterion("Jx_Percent not in", values, "jxPercent");
            return (Criteria) this;
        }

        public Criteria andJxPercentBetween(Double value1, Double value2) {
            addCriterion("Jx_Percent between", value1, value2, "jxPercent");
            return (Criteria) this;
        }

        public Criteria andJxPercentNotBetween(Double value1, Double value2) {
            addCriterion("Jx_Percent not between", value1, value2, "jxPercent");
            return (Criteria) this;
        }

        public Criteria andScoreMoneyIsNull() {
            addCriterion("Score_money is null");
            return (Criteria) this;
        }

        public Criteria andScoreMoneyIsNotNull() {
            addCriterion("Score_money is not null");
            return (Criteria) this;
        }

        public Criteria andScoreMoneyEqualTo(Double value) {
            addCriterion("Score_money =", value, "scoreMoney");
            return (Criteria) this;
        }

        public Criteria andScoreMoneyNotEqualTo(Double value) {
            addCriterion("Score_money <>", value, "scoreMoney");
            return (Criteria) this;
        }

        public Criteria andScoreMoneyGreaterThan(Double value) {
            addCriterion("Score_money >", value, "scoreMoney");
            return (Criteria) this;
        }

        public Criteria andScoreMoneyGreaterThanOrEqualTo(Double value) {
            addCriterion("Score_money >=", value, "scoreMoney");
            return (Criteria) this;
        }

        public Criteria andScoreMoneyLessThan(Double value) {
            addCriterion("Score_money <", value, "scoreMoney");
            return (Criteria) this;
        }

        public Criteria andScoreMoneyLessThanOrEqualTo(Double value) {
            addCriterion("Score_money <=", value, "scoreMoney");
            return (Criteria) this;
        }

        public Criteria andScoreMoneyIn(List<Double> values) {
            addCriterion("Score_money in", values, "scoreMoney");
            return (Criteria) this;
        }

        public Criteria andScoreMoneyNotIn(List<Double> values) {
            addCriterion("Score_money not in", values, "scoreMoney");
            return (Criteria) this;
        }

        public Criteria andScoreMoneyBetween(Double value1, Double value2) {
            addCriterion("Score_money between", value1, value2, "scoreMoney");
            return (Criteria) this;
        }

        public Criteria andScoreMoneyNotBetween(Double value1, Double value2) {
            addCriterion("Score_money not between", value1, value2, "scoreMoney");
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