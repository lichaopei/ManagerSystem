package com.guigu.system.po;

import java.util.ArrayList;
import java.util.List;

public class EmpTestExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public EmpTestExample() {
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

        public Criteria andTestIdIsNull() {
            addCriterion("Test_Id is null");
            return (Criteria) this;
        }

        public Criteria andTestIdIsNotNull() {
            addCriterion("Test_Id is not null");
            return (Criteria) this;
        }

        public Criteria andTestIdEqualTo(Integer value) {
            addCriterion("Test_Id =", value, "testId");
            return (Criteria) this;
        }

        public Criteria andTestIdNotEqualTo(Integer value) {
            addCriterion("Test_Id <>", value, "testId");
            return (Criteria) this;
        }

        public Criteria andTestIdGreaterThan(Integer value) {
            addCriterion("Test_Id >", value, "testId");
            return (Criteria) this;
        }

        public Criteria andTestIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("Test_Id >=", value, "testId");
            return (Criteria) this;
        }

        public Criteria andTestIdLessThan(Integer value) {
            addCriterion("Test_Id <", value, "testId");
            return (Criteria) this;
        }

        public Criteria andTestIdLessThanOrEqualTo(Integer value) {
            addCriterion("Test_Id <=", value, "testId");
            return (Criteria) this;
        }

        public Criteria andTestIdIn(List<Integer> values) {
            addCriterion("Test_Id in", values, "testId");
            return (Criteria) this;
        }

        public Criteria andTestIdNotIn(List<Integer> values) {
            addCriterion("Test_Id not in", values, "testId");
            return (Criteria) this;
        }

        public Criteria andTestIdBetween(Integer value1, Integer value2) {
            addCriterion("Test_Id between", value1, value2, "testId");
            return (Criteria) this;
        }

        public Criteria andTestIdNotBetween(Integer value1, Integer value2) {
            addCriterion("Test_Id not between", value1, value2, "testId");
            return (Criteria) this;
        }

        public Criteria andEmpIdIsNull() {
            addCriterion("Emp_ID is null");
            return (Criteria) this;
        }

        public Criteria andEmpIdIsNotNull() {
            addCriterion("Emp_ID is not null");
            return (Criteria) this;
        }

        public Criteria andEmpIdEqualTo(Integer value) {
            addCriterion("Emp_ID =", value, "empId");
            return (Criteria) this;
        }

        public Criteria andEmpIdNotEqualTo(Integer value) {
            addCriterion("Emp_ID <>", value, "empId");
            return (Criteria) this;
        }

        public Criteria andEmpIdGreaterThan(Integer value) {
            addCriterion("Emp_ID >", value, "empId");
            return (Criteria) this;
        }

        public Criteria andEmpIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("Emp_ID >=", value, "empId");
            return (Criteria) this;
        }

        public Criteria andEmpIdLessThan(Integer value) {
            addCriterion("Emp_ID <", value, "empId");
            return (Criteria) this;
        }

        public Criteria andEmpIdLessThanOrEqualTo(Integer value) {
            addCriterion("Emp_ID <=", value, "empId");
            return (Criteria) this;
        }

        public Criteria andEmpIdIn(List<Integer> values) {
            addCriterion("Emp_ID in", values, "empId");
            return (Criteria) this;
        }

        public Criteria andEmpIdNotIn(List<Integer> values) {
            addCriterion("Emp_ID not in", values, "empId");
            return (Criteria) this;
        }

        public Criteria andEmpIdBetween(Integer value1, Integer value2) {
            addCriterion("Emp_ID between", value1, value2, "empId");
            return (Criteria) this;
        }

        public Criteria andEmpIdNotBetween(Integer value1, Integer value2) {
            addCriterion("Emp_ID not between", value1, value2, "empId");
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

        public Criteria andUpSalaryIsNull() {
            addCriterion("Up_Salary is null");
            return (Criteria) this;
        }

        public Criteria andUpSalaryIsNotNull() {
            addCriterion("Up_Salary is not null");
            return (Criteria) this;
        }

        public Criteria andUpSalaryEqualTo(Double value) {
            addCriterion("Up_Salary =", value, "upSalary");
            return (Criteria) this;
        }

        public Criteria andUpSalaryNotEqualTo(Double value) {
            addCriterion("Up_Salary <>", value, "upSalary");
            return (Criteria) this;
        }

        public Criteria andUpSalaryGreaterThan(Double value) {
            addCriterion("Up_Salary >", value, "upSalary");
            return (Criteria) this;
        }

        public Criteria andUpSalaryGreaterThanOrEqualTo(Double value) {
            addCriterion("Up_Salary >=", value, "upSalary");
            return (Criteria) this;
        }

        public Criteria andUpSalaryLessThan(Double value) {
            addCriterion("Up_Salary <", value, "upSalary");
            return (Criteria) this;
        }

        public Criteria andUpSalaryLessThanOrEqualTo(Double value) {
            addCriterion("Up_Salary <=", value, "upSalary");
            return (Criteria) this;
        }

        public Criteria andUpSalaryIn(List<Double> values) {
            addCriterion("Up_Salary in", values, "upSalary");
            return (Criteria) this;
        }

        public Criteria andUpSalaryNotIn(List<Double> values) {
            addCriterion("Up_Salary not in", values, "upSalary");
            return (Criteria) this;
        }

        public Criteria andUpSalaryBetween(Double value1, Double value2) {
            addCriterion("Up_Salary between", value1, value2, "upSalary");
            return (Criteria) this;
        }

        public Criteria andUpSalaryNotBetween(Double value1, Double value2) {
            addCriterion("Up_Salary not between", value1, value2, "upSalary");
            return (Criteria) this;
        }

        public Criteria andJxSalaryIsNull() {
            addCriterion("JX_Salary is null");
            return (Criteria) this;
        }

        public Criteria andJxSalaryIsNotNull() {
            addCriterion("JX_Salary is not null");
            return (Criteria) this;
        }

        public Criteria andJxSalaryEqualTo(Double value) {
            addCriterion("JX_Salary =", value, "jxSalary");
            return (Criteria) this;
        }

        public Criteria andJxSalaryNotEqualTo(Double value) {
            addCriterion("JX_Salary <>", value, "jxSalary");
            return (Criteria) this;
        }

        public Criteria andJxSalaryGreaterThan(Double value) {
            addCriterion("JX_Salary >", value, "jxSalary");
            return (Criteria) this;
        }

        public Criteria andJxSalaryGreaterThanOrEqualTo(Double value) {
            addCriterion("JX_Salary >=", value, "jxSalary");
            return (Criteria) this;
        }

        public Criteria andJxSalaryLessThan(Double value) {
            addCriterion("JX_Salary <", value, "jxSalary");
            return (Criteria) this;
        }

        public Criteria andJxSalaryLessThanOrEqualTo(Double value) {
            addCriterion("JX_Salary <=", value, "jxSalary");
            return (Criteria) this;
        }

        public Criteria andJxSalaryIn(List<Double> values) {
            addCriterion("JX_Salary in", values, "jxSalary");
            return (Criteria) this;
        }

        public Criteria andJxSalaryNotIn(List<Double> values) {
            addCriterion("JX_Salary not in", values, "jxSalary");
            return (Criteria) this;
        }

        public Criteria andJxSalaryBetween(Double value1, Double value2) {
            addCriterion("JX_Salary between", value1, value2, "jxSalary");
            return (Criteria) this;
        }

        public Criteria andJxSalaryNotBetween(Double value1, Double value2) {
            addCriterion("JX_Salary not between", value1, value2, "jxSalary");
            return (Criteria) this;
        }

        public Criteria andAllSalaryIsNull() {
            addCriterion("All_Salary is null");
            return (Criteria) this;
        }

        public Criteria andAllSalaryIsNotNull() {
            addCriterion("All_Salary is not null");
            return (Criteria) this;
        }

        public Criteria andAllSalaryEqualTo(Double value) {
            addCriterion("All_Salary =", value, "allSalary");
            return (Criteria) this;
        }

        public Criteria andAllSalaryNotEqualTo(Double value) {
            addCriterion("All_Salary <>", value, "allSalary");
            return (Criteria) this;
        }

        public Criteria andAllSalaryGreaterThan(Double value) {
            addCriterion("All_Salary >", value, "allSalary");
            return (Criteria) this;
        }

        public Criteria andAllSalaryGreaterThanOrEqualTo(Double value) {
            addCriterion("All_Salary >=", value, "allSalary");
            return (Criteria) this;
        }

        public Criteria andAllSalaryLessThan(Double value) {
            addCriterion("All_Salary <", value, "allSalary");
            return (Criteria) this;
        }

        public Criteria andAllSalaryLessThanOrEqualTo(Double value) {
            addCriterion("All_Salary <=", value, "allSalary");
            return (Criteria) this;
        }

        public Criteria andAllSalaryIn(List<Double> values) {
            addCriterion("All_Salary in", values, "allSalary");
            return (Criteria) this;
        }

        public Criteria andAllSalaryNotIn(List<Double> values) {
            addCriterion("All_Salary not in", values, "allSalary");
            return (Criteria) this;
        }

        public Criteria andAllSalaryBetween(Double value1, Double value2) {
            addCriterion("All_Salary between", value1, value2, "allSalary");
            return (Criteria) this;
        }

        public Criteria andAllSalaryNotBetween(Double value1, Double value2) {
            addCriterion("All_Salary not between", value1, value2, "allSalary");
            return (Criteria) this;
        }

        public Criteria andTestScoreIsNull() {
            addCriterion("Test_Score is null");
            return (Criteria) this;
        }

        public Criteria andTestScoreIsNotNull() {
            addCriterion("Test_Score is not null");
            return (Criteria) this;
        }

        public Criteria andTestScoreEqualTo(Double value) {
            addCriterion("Test_Score =", value, "testScore");
            return (Criteria) this;
        }

        public Criteria andTestScoreNotEqualTo(Double value) {
            addCriterion("Test_Score <>", value, "testScore");
            return (Criteria) this;
        }

        public Criteria andTestScoreGreaterThan(Double value) {
            addCriterion("Test_Score >", value, "testScore");
            return (Criteria) this;
        }

        public Criteria andTestScoreGreaterThanOrEqualTo(Double value) {
            addCriterion("Test_Score >=", value, "testScore");
            return (Criteria) this;
        }

        public Criteria andTestScoreLessThan(Double value) {
            addCriterion("Test_Score <", value, "testScore");
            return (Criteria) this;
        }

        public Criteria andTestScoreLessThanOrEqualTo(Double value) {
            addCriterion("Test_Score <=", value, "testScore");
            return (Criteria) this;
        }

        public Criteria andTestScoreIn(List<Double> values) {
            addCriterion("Test_Score in", values, "testScore");
            return (Criteria) this;
        }

        public Criteria andTestScoreNotIn(List<Double> values) {
            addCriterion("Test_Score not in", values, "testScore");
            return (Criteria) this;
        }

        public Criteria andTestScoreBetween(Double value1, Double value2) {
            addCriterion("Test_Score between", value1, value2, "testScore");
            return (Criteria) this;
        }

        public Criteria andTestScoreNotBetween(Double value1, Double value2) {
            addCriterion("Test_Score not between", value1, value2, "testScore");
            return (Criteria) this;
        }

        public Criteria andTestDateIsNull() {
            addCriterion("Test_Date is null");
            return (Criteria) this;
        }

        public Criteria andTestDateIsNotNull() {
            addCriterion("Test_Date is not null");
            return (Criteria) this;
        }

        public Criteria andTestDateEqualTo(String value) {
            addCriterion("Test_Date =", value, "testDate");
            return (Criteria) this;
        }

        public Criteria andTestDateNotEqualTo(String value) {
            addCriterion("Test_Date <>", value, "testDate");
            return (Criteria) this;
        }

        public Criteria andTestDateGreaterThan(String value) {
            addCriterion("Test_Date >", value, "testDate");
            return (Criteria) this;
        }

        public Criteria andTestDateGreaterThanOrEqualTo(String value) {
            addCriterion("Test_Date >=", value, "testDate");
            return (Criteria) this;
        }

        public Criteria andTestDateLessThan(String value) {
            addCriterion("Test_Date <", value, "testDate");
            return (Criteria) this;
        }

        public Criteria andTestDateLessThanOrEqualTo(String value) {
            addCriterion("Test_Date <=", value, "testDate");
            return (Criteria) this;
        }

        public Criteria andTestDateLike(String value) {
            addCriterion("Test_Date like", value, "testDate");
            return (Criteria) this;
        }

        public Criteria andTestDateNotLike(String value) {
            addCriterion("Test_Date not like", value, "testDate");
            return (Criteria) this;
        }

        public Criteria andTestDateIn(List<String> values) {
            addCriterion("Test_Date in", values, "testDate");
            return (Criteria) this;
        }

        public Criteria andTestDateNotIn(List<String> values) {
            addCriterion("Test_Date not in", values, "testDate");
            return (Criteria) this;
        }

        public Criteria andTestDateBetween(String value1, String value2) {
            addCriterion("Test_Date between", value1, value2, "testDate");
            return (Criteria) this;
        }

        public Criteria andTestDateNotBetween(String value1, String value2) {
            addCriterion("Test_Date not between", value1, value2, "testDate");
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