package com.guigu.system.po;

import java.util.ArrayList;
import java.util.List;

public class EmpSalaryExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public EmpSalaryExample() {
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
            addCriterion("salary_id is null");
            return (Criteria) this;
        }

        public Criteria andSalaryIdIsNotNull() {
            addCriterion("salary_id is not null");
            return (Criteria) this;
        }

        public Criteria andSalaryIdEqualTo(Integer value) {
            addCriterion("salary_id =", value, "salaryId");
            return (Criteria) this;
        }

        public Criteria andSalaryIdNotEqualTo(Integer value) {
            addCriterion("salary_id <>", value, "salaryId");
            return (Criteria) this;
        }

        public Criteria andSalaryIdGreaterThan(Integer value) {
            addCriterion("salary_id >", value, "salaryId");
            return (Criteria) this;
        }

        public Criteria andSalaryIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("salary_id >=", value, "salaryId");
            return (Criteria) this;
        }

        public Criteria andSalaryIdLessThan(Integer value) {
            addCriterion("salary_id <", value, "salaryId");
            return (Criteria) this;
        }

        public Criteria andSalaryIdLessThanOrEqualTo(Integer value) {
            addCriterion("salary_id <=", value, "salaryId");
            return (Criteria) this;
        }

        public Criteria andSalaryIdIn(List<Integer> values) {
            addCriterion("salary_id in", values, "salaryId");
            return (Criteria) this;
        }

        public Criteria andSalaryIdNotIn(List<Integer> values) {
            addCriterion("salary_id not in", values, "salaryId");
            return (Criteria) this;
        }

        public Criteria andSalaryIdBetween(Integer value1, Integer value2) {
            addCriterion("salary_id between", value1, value2, "salaryId");
            return (Criteria) this;
        }

        public Criteria andSalaryIdNotBetween(Integer value1, Integer value2) {
            addCriterion("salary_id not between", value1, value2, "salaryId");
            return (Criteria) this;
        }

        public Criteria andEmpIdIsNull() {
            addCriterion("emp_Id is null");
            return (Criteria) this;
        }

        public Criteria andEmpIdIsNotNull() {
            addCriterion("emp_Id is not null");
            return (Criteria) this;
        }

        public Criteria andEmpIdEqualTo(String value) {
            addCriterion("emp_Id =", value, "empId");
            return (Criteria) this;
        }

        public Criteria andEmpIdNotEqualTo(String value) {
            addCriterion("emp_Id <>", value, "empId");
            return (Criteria) this;
        }

        public Criteria andEmpIdGreaterThan(String value) {
            addCriterion("emp_Id >", value, "empId");
            return (Criteria) this;
        }

        public Criteria andEmpIdGreaterThanOrEqualTo(String value) {
            addCriterion("emp_Id >=", value, "empId");
            return (Criteria) this;
        }

        public Criteria andEmpIdLessThan(String value) {
            addCriterion("emp_Id <", value, "empId");
            return (Criteria) this;
        }

        public Criteria andEmpIdLessThanOrEqualTo(String value) {
            addCriterion("emp_Id <=", value, "empId");
            return (Criteria) this;
        }

        public Criteria andEmpIdLike(String value) {
            addCriterion("emp_Id like", value, "empId");
            return (Criteria) this;
        }

        public Criteria andEmpIdNotLike(String value) {
            addCriterion("emp_Id not like", value, "empId");
            return (Criteria) this;
        }

        public Criteria andEmpIdIn(List<String> values) {
            addCriterion("emp_Id in", values, "empId");
            return (Criteria) this;
        }

        public Criteria andEmpIdNotIn(List<String> values) {
            addCriterion("emp_Id not in", values, "empId");
            return (Criteria) this;
        }

        public Criteria andEmpIdBetween(String value1, String value2) {
            addCriterion("emp_Id between", value1, value2, "empId");
            return (Criteria) this;
        }

        public Criteria andEmpIdNotBetween(String value1, String value2) {
            addCriterion("emp_Id not between", value1, value2, "empId");
            return (Criteria) this;
        }

        public Criteria andBaseSalaryIsNull() {
            addCriterion("base_Salary is null");
            return (Criteria) this;
        }

        public Criteria andBaseSalaryIsNotNull() {
            addCriterion("base_Salary is not null");
            return (Criteria) this;
        }

        public Criteria andBaseSalaryEqualTo(Double value) {
            addCriterion("base_Salary =", value, "baseSalary");
            return (Criteria) this;
        }

        public Criteria andBaseSalaryNotEqualTo(Double value) {
            addCriterion("base_Salary <>", value, "baseSalary");
            return (Criteria) this;
        }

        public Criteria andBaseSalaryGreaterThan(Double value) {
            addCriterion("base_Salary >", value, "baseSalary");
            return (Criteria) this;
        }

        public Criteria andBaseSalaryGreaterThanOrEqualTo(Double value) {
            addCriterion("base_Salary >=", value, "baseSalary");
            return (Criteria) this;
        }

        public Criteria andBaseSalaryLessThan(Double value) {
            addCriterion("base_Salary <", value, "baseSalary");
            return (Criteria) this;
        }

        public Criteria andBaseSalaryLessThanOrEqualTo(Double value) {
            addCriterion("base_Salary <=", value, "baseSalary");
            return (Criteria) this;
        }

        public Criteria andBaseSalaryIn(List<Double> values) {
            addCriterion("base_Salary in", values, "baseSalary");
            return (Criteria) this;
        }

        public Criteria andBaseSalaryNotIn(List<Double> values) {
            addCriterion("base_Salary not in", values, "baseSalary");
            return (Criteria) this;
        }

        public Criteria andBaseSalaryBetween(Double value1, Double value2) {
            addCriterion("base_Salary between", value1, value2, "baseSalary");
            return (Criteria) this;
        }

        public Criteria andBaseSalaryNotBetween(Double value1, Double value2) {
            addCriterion("base_Salary not between", value1, value2, "baseSalary");
            return (Criteria) this;
        }

        public Criteria andTestSalaryIsNull() {
            addCriterion("test_Salary is null");
            return (Criteria) this;
        }

        public Criteria andTestSalaryIsNotNull() {
            addCriterion("test_Salary is not null");
            return (Criteria) this;
        }

        public Criteria andTestSalaryEqualTo(Double value) {
            addCriterion("test_Salary =", value, "testSalary");
            return (Criteria) this;
        }

        public Criteria andTestSalaryNotEqualTo(Double value) {
            addCriterion("test_Salary <>", value, "testSalary");
            return (Criteria) this;
        }

        public Criteria andTestSalaryGreaterThan(Double value) {
            addCriterion("test_Salary >", value, "testSalary");
            return (Criteria) this;
        }

        public Criteria andTestSalaryGreaterThanOrEqualTo(Double value) {
            addCriterion("test_Salary >=", value, "testSalary");
            return (Criteria) this;
        }

        public Criteria andTestSalaryLessThan(Double value) {
            addCriterion("test_Salary <", value, "testSalary");
            return (Criteria) this;
        }

        public Criteria andTestSalaryLessThanOrEqualTo(Double value) {
            addCriterion("test_Salary <=", value, "testSalary");
            return (Criteria) this;
        }

        public Criteria andTestSalaryIn(List<Double> values) {
            addCriterion("test_Salary in", values, "testSalary");
            return (Criteria) this;
        }

        public Criteria andTestSalaryNotIn(List<Double> values) {
            addCriterion("test_Salary not in", values, "testSalary");
            return (Criteria) this;
        }

        public Criteria andTestSalaryBetween(Double value1, Double value2) {
            addCriterion("test_Salary between", value1, value2, "testSalary");
            return (Criteria) this;
        }

        public Criteria andTestSalaryNotBetween(Double value1, Double value2) {
            addCriterion("test_Salary not between", value1, value2, "testSalary");
            return (Criteria) this;
        }

        public Criteria andBenefitsIsNull() {
            addCriterion("benefits is null");
            return (Criteria) this;
        }

        public Criteria andBenefitsIsNotNull() {
            addCriterion("benefits is not null");
            return (Criteria) this;
        }

        public Criteria andBenefitsEqualTo(Double value) {
            addCriterion("benefits =", value, "benefits");
            return (Criteria) this;
        }

        public Criteria andBenefitsNotEqualTo(Double value) {
            addCriterion("benefits <>", value, "benefits");
            return (Criteria) this;
        }

        public Criteria andBenefitsGreaterThan(Double value) {
            addCriterion("benefits >", value, "benefits");
            return (Criteria) this;
        }

        public Criteria andBenefitsGreaterThanOrEqualTo(Double value) {
            addCriterion("benefits >=", value, "benefits");
            return (Criteria) this;
        }

        public Criteria andBenefitsLessThan(Double value) {
            addCriterion("benefits <", value, "benefits");
            return (Criteria) this;
        }

        public Criteria andBenefitsLessThanOrEqualTo(Double value) {
            addCriterion("benefits <=", value, "benefits");
            return (Criteria) this;
        }

        public Criteria andBenefitsIn(List<Double> values) {
            addCriterion("benefits in", values, "benefits");
            return (Criteria) this;
        }

        public Criteria andBenefitsNotIn(List<Double> values) {
            addCriterion("benefits not in", values, "benefits");
            return (Criteria) this;
        }

        public Criteria andBenefitsBetween(Double value1, Double value2) {
            addCriterion("benefits between", value1, value2, "benefits");
            return (Criteria) this;
        }

        public Criteria andBenefitsNotBetween(Double value1, Double value2) {
            addCriterion("benefits not between", value1, value2, "benefits");
            return (Criteria) this;
        }

        public Criteria andScottareIsNull() {
            addCriterion("scottare is null");
            return (Criteria) this;
        }

        public Criteria andScottareIsNotNull() {
            addCriterion("scottare is not null");
            return (Criteria) this;
        }

        public Criteria andScottareEqualTo(Double value) {
            addCriterion("scottare =", value, "scottare");
            return (Criteria) this;
        }

        public Criteria andScottareNotEqualTo(Double value) {
            addCriterion("scottare <>", value, "scottare");
            return (Criteria) this;
        }

        public Criteria andScottareGreaterThan(Double value) {
            addCriterion("scottare >", value, "scottare");
            return (Criteria) this;
        }

        public Criteria andScottareGreaterThanOrEqualTo(Double value) {
            addCriterion("scottare >=", value, "scottare");
            return (Criteria) this;
        }

        public Criteria andScottareLessThan(Double value) {
            addCriterion("scottare <", value, "scottare");
            return (Criteria) this;
        }

        public Criteria andScottareLessThanOrEqualTo(Double value) {
            addCriterion("scottare <=", value, "scottare");
            return (Criteria) this;
        }

        public Criteria andScottareIn(List<Double> values) {
            addCriterion("scottare in", values, "scottare");
            return (Criteria) this;
        }

        public Criteria andScottareNotIn(List<Double> values) {
            addCriterion("scottare not in", values, "scottare");
            return (Criteria) this;
        }

        public Criteria andScottareBetween(Double value1, Double value2) {
            addCriterion("scottare between", value1, value2, "scottare");
            return (Criteria) this;
        }

        public Criteria andScottareNotBetween(Double value1, Double value2) {
            addCriterion("scottare not between", value1, value2, "scottare");
            return (Criteria) this;
        }

        public Criteria andRealSalaryIsNull() {
            addCriterion("real_salary is null");
            return (Criteria) this;
        }

        public Criteria andRealSalaryIsNotNull() {
            addCriterion("real_salary is not null");
            return (Criteria) this;
        }

        public Criteria andRealSalaryEqualTo(Double value) {
            addCriterion("real_salary =", value, "realSalary");
            return (Criteria) this;
        }

        public Criteria andRealSalaryNotEqualTo(Double value) {
            addCriterion("real_salary <>", value, "realSalary");
            return (Criteria) this;
        }

        public Criteria andRealSalaryGreaterThan(Double value) {
            addCriterion("real_salary >", value, "realSalary");
            return (Criteria) this;
        }

        public Criteria andRealSalaryGreaterThanOrEqualTo(Double value) {
            addCriterion("real_salary >=", value, "realSalary");
            return (Criteria) this;
        }

        public Criteria andRealSalaryLessThan(Double value) {
            addCriterion("real_salary <", value, "realSalary");
            return (Criteria) this;
        }

        public Criteria andRealSalaryLessThanOrEqualTo(Double value) {
            addCriterion("real_salary <=", value, "realSalary");
            return (Criteria) this;
        }

        public Criteria andRealSalaryIn(List<Double> values) {
            addCriterion("real_salary in", values, "realSalary");
            return (Criteria) this;
        }

        public Criteria andRealSalaryNotIn(List<Double> values) {
            addCriterion("real_salary not in", values, "realSalary");
            return (Criteria) this;
        }

        public Criteria andRealSalaryBetween(Double value1, Double value2) {
            addCriterion("real_salary between", value1, value2, "realSalary");
            return (Criteria) this;
        }

        public Criteria andRealSalaryNotBetween(Double value1, Double value2) {
            addCriterion("real_salary not between", value1, value2, "realSalary");
            return (Criteria) this;
        }

        public Criteria andYearMonthIsNull() {
            addCriterion("year_month is null");
            return (Criteria) this;
        }

        public Criteria andYearMonthIsNotNull() {
            addCriterion("year_month is not null");
            return (Criteria) this;
        }

        public Criteria andYearMonthEqualTo(String value) {
            addCriterion("year_month =", value, "yearMonth");
            return (Criteria) this;
        }

        public Criteria andYearMonthNotEqualTo(String value) {
            addCriterion("year_month <>", value, "yearMonth");
            return (Criteria) this;
        }

        public Criteria andYearMonthGreaterThan(String value) {
            addCriterion("year_month >", value, "yearMonth");
            return (Criteria) this;
        }

        public Criteria andYearMonthGreaterThanOrEqualTo(String value) {
            addCriterion("year_month >=", value, "yearMonth");
            return (Criteria) this;
        }

        public Criteria andYearMonthLessThan(String value) {
            addCriterion("year_month <", value, "yearMonth");
            return (Criteria) this;
        }

        public Criteria andYearMonthLessThanOrEqualTo(String value) {
            addCriterion("year_month <=", value, "yearMonth");
            return (Criteria) this;
        }

        public Criteria andYearMonthLike(String value) {
            addCriterion("year_month like", value, "yearMonth");
            return (Criteria) this;
        }

        public Criteria andYearMonthNotLike(String value) {
            addCriterion("year_month not like", value, "yearMonth");
            return (Criteria) this;
        }

        public Criteria andYearMonthIn(List<String> values) {
            addCriterion("year_month in", values, "yearMonth");
            return (Criteria) this;
        }

        public Criteria andYearMonthNotIn(List<String> values) {
            addCriterion("year_month not in", values, "yearMonth");
            return (Criteria) this;
        }

        public Criteria andYearMonthBetween(String value1, String value2) {
            addCriterion("year_month between", value1, value2, "yearMonth");
            return (Criteria) this;
        }

        public Criteria andYearMonthNotBetween(String value1, String value2) {
            addCriterion("year_month not between", value1, value2, "yearMonth");
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