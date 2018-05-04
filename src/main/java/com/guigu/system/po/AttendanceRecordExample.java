package com.guigu.system.po;

import java.util.ArrayList;
import java.util.List;

public class AttendanceRecordExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AttendanceRecordExample() {
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

        public Criteria andAttendanceIdIsNull() {
            addCriterion("Attendance_ID is null");
            return (Criteria) this;
        }

        public Criteria andAttendanceIdIsNotNull() {
            addCriterion("Attendance_ID is not null");
            return (Criteria) this;
        }

        public Criteria andAttendanceIdEqualTo(Integer value) {
            addCriterion("Attendance_ID =", value, "attendanceId");
            return (Criteria) this;
        }

        public Criteria andAttendanceIdNotEqualTo(Integer value) {
            addCriterion("Attendance_ID <>", value, "attendanceId");
            return (Criteria) this;
        }

        public Criteria andAttendanceIdGreaterThan(Integer value) {
            addCriterion("Attendance_ID >", value, "attendanceId");
            return (Criteria) this;
        }

        public Criteria andAttendanceIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("Attendance_ID >=", value, "attendanceId");
            return (Criteria) this;
        }

        public Criteria andAttendanceIdLessThan(Integer value) {
            addCriterion("Attendance_ID <", value, "attendanceId");
            return (Criteria) this;
        }

        public Criteria andAttendanceIdLessThanOrEqualTo(Integer value) {
            addCriterion("Attendance_ID <=", value, "attendanceId");
            return (Criteria) this;
        }

        public Criteria andAttendanceIdIn(List<Integer> values) {
            addCriterion("Attendance_ID in", values, "attendanceId");
            return (Criteria) this;
        }

        public Criteria andAttendanceIdNotIn(List<Integer> values) {
            addCriterion("Attendance_ID not in", values, "attendanceId");
            return (Criteria) this;
        }

        public Criteria andAttendanceIdBetween(Integer value1, Integer value2) {
            addCriterion("Attendance_ID between", value1, value2, "attendanceId");
            return (Criteria) this;
        }

        public Criteria andAttendanceIdNotBetween(Integer value1, Integer value2) {
            addCriterion("Attendance_ID not between", value1, value2, "attendanceId");
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

        public Criteria andAttendanceDateIsNull() {
            addCriterion("Attendance_Date is null");
            return (Criteria) this;
        }

        public Criteria andAttendanceDateIsNotNull() {
            addCriterion("Attendance_Date is not null");
            return (Criteria) this;
        }

        public Criteria andAttendanceDateEqualTo(String value) {
            addCriterion("Attendance_Date =", value, "attendanceDate");
            return (Criteria) this;
        }

        public Criteria andAttendanceDateNotEqualTo(String value) {
            addCriterion("Attendance_Date <>", value, "attendanceDate");
            return (Criteria) this;
        }

        public Criteria andAttendanceDateGreaterThan(String value) {
            addCriterion("Attendance_Date >", value, "attendanceDate");
            return (Criteria) this;
        }

        public Criteria andAttendanceDateGreaterThanOrEqualTo(String value) {
            addCriterion("Attendance_Date >=", value, "attendanceDate");
            return (Criteria) this;
        }

        public Criteria andAttendanceDateLessThan(String value) {
            addCriterion("Attendance_Date <", value, "attendanceDate");
            return (Criteria) this;
        }

        public Criteria andAttendanceDateLessThanOrEqualTo(String value) {
            addCriterion("Attendance_Date <=", value, "attendanceDate");
            return (Criteria) this;
        }

        public Criteria andAttendanceDateLike(String value) {
            addCriterion("Attendance_Date like", value, "attendanceDate");
            return (Criteria) this;
        }

        public Criteria andAttendanceDateNotLike(String value) {
            addCriterion("Attendance_Date not like", value, "attendanceDate");
            return (Criteria) this;
        }

        public Criteria andAttendanceDateIn(List<String> values) {
            addCriterion("Attendance_Date in", values, "attendanceDate");
            return (Criteria) this;
        }

        public Criteria andAttendanceDateNotIn(List<String> values) {
            addCriterion("Attendance_Date not in", values, "attendanceDate");
            return (Criteria) this;
        }

        public Criteria andAttendanceDateBetween(String value1, String value2) {
            addCriterion("Attendance_Date between", value1, value2, "attendanceDate");
            return (Criteria) this;
        }

        public Criteria andAttendanceDateNotBetween(String value1, String value2) {
            addCriterion("Attendance_Date not between", value1, value2, "attendanceDate");
            return (Criteria) this;
        }

        public Criteria andAttendanceTypeIsNull() {
            addCriterion("Attendance_Type is null");
            return (Criteria) this;
        }

        public Criteria andAttendanceTypeIsNotNull() {
            addCriterion("Attendance_Type is not null");
            return (Criteria) this;
        }

        public Criteria andAttendanceTypeEqualTo(Integer value) {
            addCriterion("Attendance_Type =", value, "attendanceType");
            return (Criteria) this;
        }

        public Criteria andAttendanceTypeNotEqualTo(Integer value) {
            addCriterion("Attendance_Type <>", value, "attendanceType");
            return (Criteria) this;
        }

        public Criteria andAttendanceTypeGreaterThan(Integer value) {
            addCriterion("Attendance_Type >", value, "attendanceType");
            return (Criteria) this;
        }

        public Criteria andAttendanceTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("Attendance_Type >=", value, "attendanceType");
            return (Criteria) this;
        }

        public Criteria andAttendanceTypeLessThan(Integer value) {
            addCriterion("Attendance_Type <", value, "attendanceType");
            return (Criteria) this;
        }

        public Criteria andAttendanceTypeLessThanOrEqualTo(Integer value) {
            addCriterion("Attendance_Type <=", value, "attendanceType");
            return (Criteria) this;
        }

        public Criteria andAttendanceTypeIn(List<Integer> values) {
            addCriterion("Attendance_Type in", values, "attendanceType");
            return (Criteria) this;
        }

        public Criteria andAttendanceTypeNotIn(List<Integer> values) {
            addCriterion("Attendance_Type not in", values, "attendanceType");
            return (Criteria) this;
        }

        public Criteria andAttendanceTypeBetween(Integer value1, Integer value2) {
            addCriterion("Attendance_Type between", value1, value2, "attendanceType");
            return (Criteria) this;
        }

        public Criteria andAttendanceTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("Attendance_Type not between", value1, value2, "attendanceType");
            return (Criteria) this;
        }

        public Criteria andAttendanceMemoIsNull() {
            addCriterion("Attendance_Memo is null");
            return (Criteria) this;
        }

        public Criteria andAttendanceMemoIsNotNull() {
            addCriterion("Attendance_Memo is not null");
            return (Criteria) this;
        }

        public Criteria andAttendanceMemoEqualTo(String value) {
            addCriterion("Attendance_Memo =", value, "attendanceMemo");
            return (Criteria) this;
        }

        public Criteria andAttendanceMemoNotEqualTo(String value) {
            addCriterion("Attendance_Memo <>", value, "attendanceMemo");
            return (Criteria) this;
        }

        public Criteria andAttendanceMemoGreaterThan(String value) {
            addCriterion("Attendance_Memo >", value, "attendanceMemo");
            return (Criteria) this;
        }

        public Criteria andAttendanceMemoGreaterThanOrEqualTo(String value) {
            addCriterion("Attendance_Memo >=", value, "attendanceMemo");
            return (Criteria) this;
        }

        public Criteria andAttendanceMemoLessThan(String value) {
            addCriterion("Attendance_Memo <", value, "attendanceMemo");
            return (Criteria) this;
        }

        public Criteria andAttendanceMemoLessThanOrEqualTo(String value) {
            addCriterion("Attendance_Memo <=", value, "attendanceMemo");
            return (Criteria) this;
        }

        public Criteria andAttendanceMemoLike(String value) {
            addCriterion("Attendance_Memo like", value, "attendanceMemo");
            return (Criteria) this;
        }

        public Criteria andAttendanceMemoNotLike(String value) {
            addCriterion("Attendance_Memo not like", value, "attendanceMemo");
            return (Criteria) this;
        }

        public Criteria andAttendanceMemoIn(List<String> values) {
            addCriterion("Attendance_Memo in", values, "attendanceMemo");
            return (Criteria) this;
        }

        public Criteria andAttendanceMemoNotIn(List<String> values) {
            addCriterion("Attendance_Memo not in", values, "attendanceMemo");
            return (Criteria) this;
        }

        public Criteria andAttendanceMemoBetween(String value1, String value2) {
            addCriterion("Attendance_Memo between", value1, value2, "attendanceMemo");
            return (Criteria) this;
        }

        public Criteria andAttendanceMemoNotBetween(String value1, String value2) {
            addCriterion("Attendance_Memo not between", value1, value2, "attendanceMemo");
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

        public Criteria andNodeIdIsNull() {
            addCriterion("Node_ID is null");
            return (Criteria) this;
        }

        public Criteria andNodeIdIsNotNull() {
            addCriterion("Node_ID is not null");
            return (Criteria) this;
        }

        public Criteria andNodeIdEqualTo(Integer value) {
            addCriterion("Node_ID =", value, "nodeId");
            return (Criteria) this;
        }

        public Criteria andNodeIdNotEqualTo(Integer value) {
            addCriterion("Node_ID <>", value, "nodeId");
            return (Criteria) this;
        }

        public Criteria andNodeIdGreaterThan(Integer value) {
            addCriterion("Node_ID >", value, "nodeId");
            return (Criteria) this;
        }

        public Criteria andNodeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("Node_ID >=", value, "nodeId");
            return (Criteria) this;
        }

        public Criteria andNodeIdLessThan(Integer value) {
            addCriterion("Node_ID <", value, "nodeId");
            return (Criteria) this;
        }

        public Criteria andNodeIdLessThanOrEqualTo(Integer value) {
            addCriterion("Node_ID <=", value, "nodeId");
            return (Criteria) this;
        }

        public Criteria andNodeIdIn(List<Integer> values) {
            addCriterion("Node_ID in", values, "nodeId");
            return (Criteria) this;
        }

        public Criteria andNodeIdNotIn(List<Integer> values) {
            addCriterion("Node_ID not in", values, "nodeId");
            return (Criteria) this;
        }

        public Criteria andNodeIdBetween(Integer value1, Integer value2) {
            addCriterion("Node_ID between", value1, value2, "nodeId");
            return (Criteria) this;
        }

        public Criteria andNodeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("Node_ID not between", value1, value2, "nodeId");
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