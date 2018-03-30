package com.guigu.system.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class NotesExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public NotesExample() {
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

        public Criteria andNodeTypeIsNull() {
            addCriterion("Node_Type is null");
            return (Criteria) this;
        }

        public Criteria andNodeTypeIsNotNull() {
            addCriterion("Node_Type is not null");
            return (Criteria) this;
        }

        public Criteria andNodeTypeEqualTo(Integer value) {
            addCriterion("Node_Type =", value, "nodeType");
            return (Criteria) this;
        }

        public Criteria andNodeTypeNotEqualTo(Integer value) {
            addCriterion("Node_Type <>", value, "nodeType");
            return (Criteria) this;
        }

        public Criteria andNodeTypeGreaterThan(Integer value) {
            addCriterion("Node_Type >", value, "nodeType");
            return (Criteria) this;
        }

        public Criteria andNodeTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("Node_Type >=", value, "nodeType");
            return (Criteria) this;
        }

        public Criteria andNodeTypeLessThan(Integer value) {
            addCriterion("Node_Type <", value, "nodeType");
            return (Criteria) this;
        }

        public Criteria andNodeTypeLessThanOrEqualTo(Integer value) {
            addCriterion("Node_Type <=", value, "nodeType");
            return (Criteria) this;
        }

        public Criteria andNodeTypeIn(List<Integer> values) {
            addCriterion("Node_Type in", values, "nodeType");
            return (Criteria) this;
        }

        public Criteria andNodeTypeNotIn(List<Integer> values) {
            addCriterion("Node_Type not in", values, "nodeType");
            return (Criteria) this;
        }

        public Criteria andNodeTypeBetween(Integer value1, Integer value2) {
            addCriterion("Node_Type between", value1, value2, "nodeType");
            return (Criteria) this;
        }

        public Criteria andNodeTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("Node_Type not between", value1, value2, "nodeType");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdsIsNull() {
            addCriterion("Employee_IDs is null");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdsIsNotNull() {
            addCriterion("Employee_IDs is not null");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdsEqualTo(String value) {
            addCriterion("Employee_IDs =", value, "employeeIds");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdsNotEqualTo(String value) {
            addCriterion("Employee_IDs <>", value, "employeeIds");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdsGreaterThan(String value) {
            addCriterion("Employee_IDs >", value, "employeeIds");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdsGreaterThanOrEqualTo(String value) {
            addCriterion("Employee_IDs >=", value, "employeeIds");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdsLessThan(String value) {
            addCriterion("Employee_IDs <", value, "employeeIds");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdsLessThanOrEqualTo(String value) {
            addCriterion("Employee_IDs <=", value, "employeeIds");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdsLike(String value) {
            addCriterion("Employee_IDs like", value, "employeeIds");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdsNotLike(String value) {
            addCriterion("Employee_IDs not like", value, "employeeIds");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdsIn(List<String> values) {
            addCriterion("Employee_IDs in", values, "employeeIds");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdsNotIn(List<String> values) {
            addCriterion("Employee_IDs not in", values, "employeeIds");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdsBetween(String value1, String value2) {
            addCriterion("Employee_IDs between", value1, value2, "employeeIds");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdsNotBetween(String value1, String value2) {
            addCriterion("Employee_IDs not between", value1, value2, "employeeIds");
            return (Criteria) this;
        }

        public Criteria andCauseIsNull() {
            addCriterion("Cause is null");
            return (Criteria) this;
        }

        public Criteria andCauseIsNotNull() {
            addCriterion("Cause is not null");
            return (Criteria) this;
        }

        public Criteria andCauseEqualTo(String value) {
            addCriterion("Cause =", value, "cause");
            return (Criteria) this;
        }

        public Criteria andCauseNotEqualTo(String value) {
            addCriterion("Cause <>", value, "cause");
            return (Criteria) this;
        }

        public Criteria andCauseGreaterThan(String value) {
            addCriterion("Cause >", value, "cause");
            return (Criteria) this;
        }

        public Criteria andCauseGreaterThanOrEqualTo(String value) {
            addCriterion("Cause >=", value, "cause");
            return (Criteria) this;
        }

        public Criteria andCauseLessThan(String value) {
            addCriterion("Cause <", value, "cause");
            return (Criteria) this;
        }

        public Criteria andCauseLessThanOrEqualTo(String value) {
            addCriterion("Cause <=", value, "cause");
            return (Criteria) this;
        }

        public Criteria andCauseLike(String value) {
            addCriterion("Cause like", value, "cause");
            return (Criteria) this;
        }

        public Criteria andCauseNotLike(String value) {
            addCriterion("Cause not like", value, "cause");
            return (Criteria) this;
        }

        public Criteria andCauseIn(List<String> values) {
            addCriterion("Cause in", values, "cause");
            return (Criteria) this;
        }

        public Criteria andCauseNotIn(List<String> values) {
            addCriterion("Cause not in", values, "cause");
            return (Criteria) this;
        }

        public Criteria andCauseBetween(String value1, String value2) {
            addCriterion("Cause between", value1, value2, "cause");
            return (Criteria) this;
        }

        public Criteria andCauseNotBetween(String value1, String value2) {
            addCriterion("Cause not between", value1, value2, "cause");
            return (Criteria) this;
        }

        public Criteria andFillinTimeIsNull() {
            addCriterion("FillIn_Time is null");
            return (Criteria) this;
        }

        public Criteria andFillinTimeIsNotNull() {
            addCriterion("FillIn_Time is not null");
            return (Criteria) this;
        }

        public Criteria andFillinTimeEqualTo(Date value) {
            addCriterion("FillIn_Time =", value, "fillinTime");
            return (Criteria) this;
        }

        public Criteria andFillinTimeNotEqualTo(Date value) {
            addCriterion("FillIn_Time <>", value, "fillinTime");
            return (Criteria) this;
        }

        public Criteria andFillinTimeGreaterThan(Date value) {
            addCriterion("FillIn_Time >", value, "fillinTime");
            return (Criteria) this;
        }

        public Criteria andFillinTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("FillIn_Time >=", value, "fillinTime");
            return (Criteria) this;
        }

        public Criteria andFillinTimeLessThan(Date value) {
            addCriterion("FillIn_Time <", value, "fillinTime");
            return (Criteria) this;
        }

        public Criteria andFillinTimeLessThanOrEqualTo(Date value) {
            addCriterion("FillIn_Time <=", value, "fillinTime");
            return (Criteria) this;
        }

        public Criteria andFillinTimeIn(List<Date> values) {
            addCriterion("FillIn_Time in", values, "fillinTime");
            return (Criteria) this;
        }

        public Criteria andFillinTimeNotIn(List<Date> values) {
            addCriterion("FillIn_Time not in", values, "fillinTime");
            return (Criteria) this;
        }

        public Criteria andFillinTimeBetween(Date value1, Date value2) {
            addCriterion("FillIn_Time between", value1, value2, "fillinTime");
            return (Criteria) this;
        }

        public Criteria andFillinTimeNotBetween(Date value1, Date value2) {
            addCriterion("FillIn_Time not between", value1, value2, "fillinTime");
            return (Criteria) this;
        }

        public Criteria andDirectorSignIsNull() {
            addCriterion("Director_Sign is null");
            return (Criteria) this;
        }

        public Criteria andDirectorSignIsNotNull() {
            addCriterion("Director_Sign is not null");
            return (Criteria) this;
        }

        public Criteria andDirectorSignEqualTo(String value) {
            addCriterion("Director_Sign =", value, "directorSign");
            return (Criteria) this;
        }

        public Criteria andDirectorSignNotEqualTo(String value) {
            addCriterion("Director_Sign <>", value, "directorSign");
            return (Criteria) this;
        }

        public Criteria andDirectorSignGreaterThan(String value) {
            addCriterion("Director_Sign >", value, "directorSign");
            return (Criteria) this;
        }

        public Criteria andDirectorSignGreaterThanOrEqualTo(String value) {
            addCriterion("Director_Sign >=", value, "directorSign");
            return (Criteria) this;
        }

        public Criteria andDirectorSignLessThan(String value) {
            addCriterion("Director_Sign <", value, "directorSign");
            return (Criteria) this;
        }

        public Criteria andDirectorSignLessThanOrEqualTo(String value) {
            addCriterion("Director_Sign <=", value, "directorSign");
            return (Criteria) this;
        }

        public Criteria andDirectorSignLike(String value) {
            addCriterion("Director_Sign like", value, "directorSign");
            return (Criteria) this;
        }

        public Criteria andDirectorSignNotLike(String value) {
            addCriterion("Director_Sign not like", value, "directorSign");
            return (Criteria) this;
        }

        public Criteria andDirectorSignIn(List<String> values) {
            addCriterion("Director_Sign in", values, "directorSign");
            return (Criteria) this;
        }

        public Criteria andDirectorSignNotIn(List<String> values) {
            addCriterion("Director_Sign not in", values, "directorSign");
            return (Criteria) this;
        }

        public Criteria andDirectorSignBetween(String value1, String value2) {
            addCriterion("Director_Sign between", value1, value2, "directorSign");
            return (Criteria) this;
        }

        public Criteria andDirectorSignNotBetween(String value1, String value2) {
            addCriterion("Director_Sign not between", value1, value2, "directorSign");
            return (Criteria) this;
        }

        public Criteria andAdminnistrationSignIsNull() {
            addCriterion("Adminnistration_Sign is null");
            return (Criteria) this;
        }

        public Criteria andAdminnistrationSignIsNotNull() {
            addCriterion("Adminnistration_Sign is not null");
            return (Criteria) this;
        }

        public Criteria andAdminnistrationSignEqualTo(String value) {
            addCriterion("Adminnistration_Sign =", value, "adminnistrationSign");
            return (Criteria) this;
        }

        public Criteria andAdminnistrationSignNotEqualTo(String value) {
            addCriterion("Adminnistration_Sign <>", value, "adminnistrationSign");
            return (Criteria) this;
        }

        public Criteria andAdminnistrationSignGreaterThan(String value) {
            addCriterion("Adminnistration_Sign >", value, "adminnistrationSign");
            return (Criteria) this;
        }

        public Criteria andAdminnistrationSignGreaterThanOrEqualTo(String value) {
            addCriterion("Adminnistration_Sign >=", value, "adminnistrationSign");
            return (Criteria) this;
        }

        public Criteria andAdminnistrationSignLessThan(String value) {
            addCriterion("Adminnistration_Sign <", value, "adminnistrationSign");
            return (Criteria) this;
        }

        public Criteria andAdminnistrationSignLessThanOrEqualTo(String value) {
            addCriterion("Adminnistration_Sign <=", value, "adminnistrationSign");
            return (Criteria) this;
        }

        public Criteria andAdminnistrationSignLike(String value) {
            addCriterion("Adminnistration_Sign like", value, "adminnistrationSign");
            return (Criteria) this;
        }

        public Criteria andAdminnistrationSignNotLike(String value) {
            addCriterion("Adminnistration_Sign not like", value, "adminnistrationSign");
            return (Criteria) this;
        }

        public Criteria andAdminnistrationSignIn(List<String> values) {
            addCriterion("Adminnistration_Sign in", values, "adminnistrationSign");
            return (Criteria) this;
        }

        public Criteria andAdminnistrationSignNotIn(List<String> values) {
            addCriterion("Adminnistration_Sign not in", values, "adminnistrationSign");
            return (Criteria) this;
        }

        public Criteria andAdminnistrationSignBetween(String value1, String value2) {
            addCriterion("Adminnistration_Sign between", value1, value2, "adminnistrationSign");
            return (Criteria) this;
        }

        public Criteria andAdminnistrationSignNotBetween(String value1, String value2) {
            addCriterion("Adminnistration_Sign not between", value1, value2, "adminnistrationSign");
            return (Criteria) this;
        }

        public Criteria andPresidentSignIsNull() {
            addCriterion("President_Sign is null");
            return (Criteria) this;
        }

        public Criteria andPresidentSignIsNotNull() {
            addCriterion("President_Sign is not null");
            return (Criteria) this;
        }

        public Criteria andPresidentSignEqualTo(String value) {
            addCriterion("President_Sign =", value, "presidentSign");
            return (Criteria) this;
        }

        public Criteria andPresidentSignNotEqualTo(String value) {
            addCriterion("President_Sign <>", value, "presidentSign");
            return (Criteria) this;
        }

        public Criteria andPresidentSignGreaterThan(String value) {
            addCriterion("President_Sign >", value, "presidentSign");
            return (Criteria) this;
        }

        public Criteria andPresidentSignGreaterThanOrEqualTo(String value) {
            addCriterion("President_Sign >=", value, "presidentSign");
            return (Criteria) this;
        }

        public Criteria andPresidentSignLessThan(String value) {
            addCriterion("President_Sign <", value, "presidentSign");
            return (Criteria) this;
        }

        public Criteria andPresidentSignLessThanOrEqualTo(String value) {
            addCriterion("President_Sign <=", value, "presidentSign");
            return (Criteria) this;
        }

        public Criteria andPresidentSignLike(String value) {
            addCriterion("President_Sign like", value, "presidentSign");
            return (Criteria) this;
        }

        public Criteria andPresidentSignNotLike(String value) {
            addCriterion("President_Sign not like", value, "presidentSign");
            return (Criteria) this;
        }

        public Criteria andPresidentSignIn(List<String> values) {
            addCriterion("President_Sign in", values, "presidentSign");
            return (Criteria) this;
        }

        public Criteria andPresidentSignNotIn(List<String> values) {
            addCriterion("President_Sign not in", values, "presidentSign");
            return (Criteria) this;
        }

        public Criteria andPresidentSignBetween(String value1, String value2) {
            addCriterion("President_Sign between", value1, value2, "presidentSign");
            return (Criteria) this;
        }

        public Criteria andPresidentSignNotBetween(String value1, String value2) {
            addCriterion("President_Sign not between", value1, value2, "presidentSign");
            return (Criteria) this;
        }

        public Criteria andStartDateIsNull() {
            addCriterion("Start_Date is null");
            return (Criteria) this;
        }

        public Criteria andStartDateIsNotNull() {
            addCriterion("Start_Date is not null");
            return (Criteria) this;
        }

        public Criteria andStartDateEqualTo(Date value) {
            addCriterion("Start_Date =", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateNotEqualTo(Date value) {
            addCriterion("Start_Date <>", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateGreaterThan(Date value) {
            addCriterion("Start_Date >", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateGreaterThanOrEqualTo(Date value) {
            addCriterion("Start_Date >=", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateLessThan(Date value) {
            addCriterion("Start_Date <", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateLessThanOrEqualTo(Date value) {
            addCriterion("Start_Date <=", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateIn(List<Date> values) {
            addCriterion("Start_Date in", values, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateNotIn(List<Date> values) {
            addCriterion("Start_Date not in", values, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateBetween(Date value1, Date value2) {
            addCriterion("Start_Date between", value1, value2, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateNotBetween(Date value1, Date value2) {
            addCriterion("Start_Date not between", value1, value2, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartTimeIsNull() {
            addCriterion("Start_Time is null");
            return (Criteria) this;
        }

        public Criteria andStartTimeIsNotNull() {
            addCriterion("Start_Time is not null");
            return (Criteria) this;
        }

        public Criteria andStartTimeEqualTo(Date value) {
            addCriterion("Start_Time =", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotEqualTo(Date value) {
            addCriterion("Start_Time <>", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeGreaterThan(Date value) {
            addCriterion("Start_Time >", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("Start_Time >=", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeLessThan(Date value) {
            addCriterion("Start_Time <", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeLessThanOrEqualTo(Date value) {
            addCriterion("Start_Time <=", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeIn(List<Date> values) {
            addCriterion("Start_Time in", values, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotIn(List<Date> values) {
            addCriterion("Start_Time not in", values, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeBetween(Date value1, Date value2) {
            addCriterion("Start_Time between", value1, value2, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotBetween(Date value1, Date value2) {
            addCriterion("Start_Time not between", value1, value2, "startTime");
            return (Criteria) this;
        }

        public Criteria andEndDateIsNull() {
            addCriterion("End_Date is null");
            return (Criteria) this;
        }

        public Criteria andEndDateIsNotNull() {
            addCriterion("End_Date is not null");
            return (Criteria) this;
        }

        public Criteria andEndDateEqualTo(Date value) {
            addCriterion("End_Date =", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateNotEqualTo(Date value) {
            addCriterion("End_Date <>", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateGreaterThan(Date value) {
            addCriterion("End_Date >", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateGreaterThanOrEqualTo(Date value) {
            addCriterion("End_Date >=", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateLessThan(Date value) {
            addCriterion("End_Date <", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateLessThanOrEqualTo(Date value) {
            addCriterion("End_Date <=", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateIn(List<Date> values) {
            addCriterion("End_Date in", values, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateNotIn(List<Date> values) {
            addCriterion("End_Date not in", values, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateBetween(Date value1, Date value2) {
            addCriterion("End_Date between", value1, value2, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateNotBetween(Date value1, Date value2) {
            addCriterion("End_Date not between", value1, value2, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndTimeIsNull() {
            addCriterion("End_Time is null");
            return (Criteria) this;
        }

        public Criteria andEndTimeIsNotNull() {
            addCriterion("End_Time is not null");
            return (Criteria) this;
        }

        public Criteria andEndTimeEqualTo(Date value) {
            addCriterion("End_Time =", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotEqualTo(Date value) {
            addCriterion("End_Time <>", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeGreaterThan(Date value) {
            addCriterion("End_Time >", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("End_Time >=", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeLessThan(Date value) {
            addCriterion("End_Time <", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeLessThanOrEqualTo(Date value) {
            addCriterion("End_Time <=", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeIn(List<Date> values) {
            addCriterion("End_Time in", values, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotIn(List<Date> values) {
            addCriterion("End_Time not in", values, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeBetween(Date value1, Date value2) {
            addCriterion("End_Time between", value1, value2, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotBetween(Date value1, Date value2) {
            addCriterion("End_Time not between", value1, value2, "endTime");
            return (Criteria) this;
        }

        public Criteria andOvertimeIdsIsNull() {
            addCriterion("OverTime_IDS is null");
            return (Criteria) this;
        }

        public Criteria andOvertimeIdsIsNotNull() {
            addCriterion("OverTime_IDS is not null");
            return (Criteria) this;
        }

        public Criteria andOvertimeIdsEqualTo(String value) {
            addCriterion("OverTime_IDS =", value, "overtimeIds");
            return (Criteria) this;
        }

        public Criteria andOvertimeIdsNotEqualTo(String value) {
            addCriterion("OverTime_IDS <>", value, "overtimeIds");
            return (Criteria) this;
        }

        public Criteria andOvertimeIdsGreaterThan(String value) {
            addCriterion("OverTime_IDS >", value, "overtimeIds");
            return (Criteria) this;
        }

        public Criteria andOvertimeIdsGreaterThanOrEqualTo(String value) {
            addCriterion("OverTime_IDS >=", value, "overtimeIds");
            return (Criteria) this;
        }

        public Criteria andOvertimeIdsLessThan(String value) {
            addCriterion("OverTime_IDS <", value, "overtimeIds");
            return (Criteria) this;
        }

        public Criteria andOvertimeIdsLessThanOrEqualTo(String value) {
            addCriterion("OverTime_IDS <=", value, "overtimeIds");
            return (Criteria) this;
        }

        public Criteria andOvertimeIdsLike(String value) {
            addCriterion("OverTime_IDS like", value, "overtimeIds");
            return (Criteria) this;
        }

        public Criteria andOvertimeIdsNotLike(String value) {
            addCriterion("OverTime_IDS not like", value, "overtimeIds");
            return (Criteria) this;
        }

        public Criteria andOvertimeIdsIn(List<String> values) {
            addCriterion("OverTime_IDS in", values, "overtimeIds");
            return (Criteria) this;
        }

        public Criteria andOvertimeIdsNotIn(List<String> values) {
            addCriterion("OverTime_IDS not in", values, "overtimeIds");
            return (Criteria) this;
        }

        public Criteria andOvertimeIdsBetween(String value1, String value2) {
            addCriterion("OverTime_IDS between", value1, value2, "overtimeIds");
            return (Criteria) this;
        }

        public Criteria andOvertimeIdsNotBetween(String value1, String value2) {
            addCriterion("OverTime_IDS not between", value1, value2, "overtimeIds");
            return (Criteria) this;
        }

        public Criteria andVehicleIsNull() {
            addCriterion("Vehicle is null");
            return (Criteria) this;
        }

        public Criteria andVehicleIsNotNull() {
            addCriterion("Vehicle is not null");
            return (Criteria) this;
        }

        public Criteria andVehicleEqualTo(String value) {
            addCriterion("Vehicle =", value, "vehicle");
            return (Criteria) this;
        }

        public Criteria andVehicleNotEqualTo(String value) {
            addCriterion("Vehicle <>", value, "vehicle");
            return (Criteria) this;
        }

        public Criteria andVehicleGreaterThan(String value) {
            addCriterion("Vehicle >", value, "vehicle");
            return (Criteria) this;
        }

        public Criteria andVehicleGreaterThanOrEqualTo(String value) {
            addCriterion("Vehicle >=", value, "vehicle");
            return (Criteria) this;
        }

        public Criteria andVehicleLessThan(String value) {
            addCriterion("Vehicle <", value, "vehicle");
            return (Criteria) this;
        }

        public Criteria andVehicleLessThanOrEqualTo(String value) {
            addCriterion("Vehicle <=", value, "vehicle");
            return (Criteria) this;
        }

        public Criteria andVehicleLike(String value) {
            addCriterion("Vehicle like", value, "vehicle");
            return (Criteria) this;
        }

        public Criteria andVehicleNotLike(String value) {
            addCriterion("Vehicle not like", value, "vehicle");
            return (Criteria) this;
        }

        public Criteria andVehicleIn(List<String> values) {
            addCriterion("Vehicle in", values, "vehicle");
            return (Criteria) this;
        }

        public Criteria andVehicleNotIn(List<String> values) {
            addCriterion("Vehicle not in", values, "vehicle");
            return (Criteria) this;
        }

        public Criteria andVehicleBetween(String value1, String value2) {
            addCriterion("Vehicle between", value1, value2, "vehicle");
            return (Criteria) this;
        }

        public Criteria andVehicleNotBetween(String value1, String value2) {
            addCriterion("Vehicle not between", value1, value2, "vehicle");
            return (Criteria) this;
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

        public Criteria andNoteMemoIsNull() {
            addCriterion("Note_Memo is null");
            return (Criteria) this;
        }

        public Criteria andNoteMemoIsNotNull() {
            addCriterion("Note_Memo is not null");
            return (Criteria) this;
        }

        public Criteria andNoteMemoEqualTo(String value) {
            addCriterion("Note_Memo =", value, "noteMemo");
            return (Criteria) this;
        }

        public Criteria andNoteMemoNotEqualTo(String value) {
            addCriterion("Note_Memo <>", value, "noteMemo");
            return (Criteria) this;
        }

        public Criteria andNoteMemoGreaterThan(String value) {
            addCriterion("Note_Memo >", value, "noteMemo");
            return (Criteria) this;
        }

        public Criteria andNoteMemoGreaterThanOrEqualTo(String value) {
            addCriterion("Note_Memo >=", value, "noteMemo");
            return (Criteria) this;
        }

        public Criteria andNoteMemoLessThan(String value) {
            addCriterion("Note_Memo <", value, "noteMemo");
            return (Criteria) this;
        }

        public Criteria andNoteMemoLessThanOrEqualTo(String value) {
            addCriterion("Note_Memo <=", value, "noteMemo");
            return (Criteria) this;
        }

        public Criteria andNoteMemoLike(String value) {
            addCriterion("Note_Memo like", value, "noteMemo");
            return (Criteria) this;
        }

        public Criteria andNoteMemoNotLike(String value) {
            addCriterion("Note_Memo not like", value, "noteMemo");
            return (Criteria) this;
        }

        public Criteria andNoteMemoIn(List<String> values) {
            addCriterion("Note_Memo in", values, "noteMemo");
            return (Criteria) this;
        }

        public Criteria andNoteMemoNotIn(List<String> values) {
            addCriterion("Note_Memo not in", values, "noteMemo");
            return (Criteria) this;
        }

        public Criteria andNoteMemoBetween(String value1, String value2) {
            addCriterion("Note_Memo between", value1, value2, "noteMemo");
            return (Criteria) this;
        }

        public Criteria andNoteMemoNotBetween(String value1, String value2) {
            addCriterion("Note_Memo not between", value1, value2, "noteMemo");
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