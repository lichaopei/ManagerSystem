package com.guigu.system.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OrdersExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OrdersExample() {
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

        public Criteria andOrderIdIsNull() {
            addCriterion("order_id is null");
            return (Criteria) this;
        }

        public Criteria andOrderIdIsNotNull() {
            addCriterion("order_id is not null");
            return (Criteria) this;
        }

        public Criteria andOrderIdEqualTo(Integer value) {
            addCriterion("order_id =", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotEqualTo(Integer value) {
            addCriterion("order_id <>", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThan(Integer value) {
            addCriterion("order_id >", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("order_id >=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThan(Integer value) {
            addCriterion("order_id <", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThanOrEqualTo(Integer value) {
            addCriterion("order_id <=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdIn(List<Integer> values) {
            addCriterion("order_id in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotIn(List<Integer> values) {
            addCriterion("order_id not in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdBetween(Integer value1, Integer value2) {
            addCriterion("order_id between", value1, value2, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotBetween(Integer value1, Integer value2) {
            addCriterion("order_id not between", value1, value2, "orderId");
            return (Criteria) this;
        }

        public Criteria andTypeIdIsNull() {
            addCriterion("type_id is null");
            return (Criteria) this;
        }

        public Criteria andTypeIdIsNotNull() {
            addCriterion("type_id is not null");
            return (Criteria) this;
        }

        public Criteria andTypeIdEqualTo(Integer value) {
            addCriterion("type_id =", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdNotEqualTo(Integer value) {
            addCriterion("type_id <>", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdGreaterThan(Integer value) {
            addCriterion("type_id >", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("type_id >=", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdLessThan(Integer value) {
            addCriterion("type_id <", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdLessThanOrEqualTo(Integer value) {
            addCriterion("type_id <=", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdIn(List<Integer> values) {
            addCriterion("type_id in", values, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdNotIn(List<Integer> values) {
            addCriterion("type_id not in", values, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdBetween(Integer value1, Integer value2) {
            addCriterion("type_id between", value1, value2, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("type_id not between", value1, value2, "typeId");
            return (Criteria) this;
        }

        public Criteria andCustomerIsNull() {
            addCriterion("customer is null");
            return (Criteria) this;
        }

        public Criteria andCustomerIsNotNull() {
            addCriterion("customer is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerEqualTo(String value) {
            addCriterion("customer =", value, "customer");
            return (Criteria) this;
        }

        public Criteria andCustomerNotEqualTo(String value) {
            addCriterion("customer <>", value, "customer");
            return (Criteria) this;
        }

        public Criteria andCustomerGreaterThan(String value) {
            addCriterion("customer >", value, "customer");
            return (Criteria) this;
        }

        public Criteria andCustomerGreaterThanOrEqualTo(String value) {
            addCriterion("customer >=", value, "customer");
            return (Criteria) this;
        }

        public Criteria andCustomerLessThan(String value) {
            addCriterion("customer <", value, "customer");
            return (Criteria) this;
        }

        public Criteria andCustomerLessThanOrEqualTo(String value) {
            addCriterion("customer <=", value, "customer");
            return (Criteria) this;
        }

        public Criteria andCustomerLike(String value) {
            addCriterion("customer like", value, "customer");
            return (Criteria) this;
        }

        public Criteria andCustomerNotLike(String value) {
            addCriterion("customer not like", value, "customer");
            return (Criteria) this;
        }

        public Criteria andCustomerIn(List<String> values) {
            addCriterion("customer in", values, "customer");
            return (Criteria) this;
        }

        public Criteria andCustomerNotIn(List<String> values) {
            addCriterion("customer not in", values, "customer");
            return (Criteria) this;
        }

        public Criteria andCustomerBetween(String value1, String value2) {
            addCriterion("customer between", value1, value2, "customer");
            return (Criteria) this;
        }

        public Criteria andCustomerNotBetween(String value1, String value2) {
            addCriterion("customer not between", value1, value2, "customer");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNull() {
            addCriterion("phone is null");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNotNull() {
            addCriterion("phone is not null");
            return (Criteria) this;
        }

        public Criteria andPhoneEqualTo(String value) {
            addCriterion("phone =", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotEqualTo(String value) {
            addCriterion("phone <>", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThan(String value) {
            addCriterion("phone >", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("phone >=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThan(String value) {
            addCriterion("phone <", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThanOrEqualTo(String value) {
            addCriterion("phone <=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLike(String value) {
            addCriterion("phone like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotLike(String value) {
            addCriterion("phone not like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneIn(List<String> values) {
            addCriterion("phone in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotIn(List<String> values) {
            addCriterion("phone not in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneBetween(String value1, String value2) {
            addCriterion("phone between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotBetween(String value1, String value2) {
            addCriterion("phone not between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andDateIsNull() {
            addCriterion("date is null");
            return (Criteria) this;
        }

        public Criteria andDateIsNotNull() {
            addCriterion("date is not null");
            return (Criteria) this;
        }

        public Criteria andDateEqualTo(Date value) {
            addCriterion("date =", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateNotEqualTo(Date value) {
            addCriterion("date <>", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateGreaterThan(Date value) {
            addCriterion("date >", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateGreaterThanOrEqualTo(Date value) {
            addCriterion("date >=", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateLessThan(Date value) {
            addCriterion("date <", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateLessThanOrEqualTo(Date value) {
            addCriterion("date <=", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateIn(List<Date> values) {
            addCriterion("date in", values, "date");
            return (Criteria) this;
        }

        public Criteria andDateNotIn(List<Date> values) {
            addCriterion("date not in", values, "date");
            return (Criteria) this;
        }

        public Criteria andDateBetween(Date value1, Date value2) {
            addCriterion("date between", value1, value2, "date");
            return (Criteria) this;
        }

        public Criteria andDateNotBetween(Date value1, Date value2) {
            addCriterion("date not between", value1, value2, "date");
            return (Criteria) this;
        }

        public Criteria andFrontCostIsNull() {
            addCriterion("front_cost is null");
            return (Criteria) this;
        }

        public Criteria andFrontCostIsNotNull() {
            addCriterion("front_cost is not null");
            return (Criteria) this;
        }

        public Criteria andFrontCostEqualTo(Double value) {
            addCriterion("front_cost =", value, "frontCost");
            return (Criteria) this;
        }

        public Criteria andFrontCostNotEqualTo(Double value) {
            addCriterion("front_cost <>", value, "frontCost");
            return (Criteria) this;
        }

        public Criteria andFrontCostGreaterThan(Double value) {
            addCriterion("front_cost >", value, "frontCost");
            return (Criteria) this;
        }

        public Criteria andFrontCostGreaterThanOrEqualTo(Double value) {
            addCriterion("front_cost >=", value, "frontCost");
            return (Criteria) this;
        }

        public Criteria andFrontCostLessThan(Double value) {
            addCriterion("front_cost <", value, "frontCost");
            return (Criteria) this;
        }

        public Criteria andFrontCostLessThanOrEqualTo(Double value) {
            addCriterion("front_cost <=", value, "frontCost");
            return (Criteria) this;
        }

        public Criteria andFrontCostIn(List<Double> values) {
            addCriterion("front_cost in", values, "frontCost");
            return (Criteria) this;
        }

        public Criteria andFrontCostNotIn(List<Double> values) {
            addCriterion("front_cost not in", values, "frontCost");
            return (Criteria) this;
        }

        public Criteria andFrontCostBetween(Double value1, Double value2) {
            addCriterion("front_cost between", value1, value2, "frontCost");
            return (Criteria) this;
        }

        public Criteria andFrontCostNotBetween(Double value1, Double value2) {
            addCriterion("front_cost not between", value1, value2, "frontCost");
            return (Criteria) this;
        }

        public Criteria andSecondCostIsNull() {
            addCriterion("second_cost is null");
            return (Criteria) this;
        }

        public Criteria andSecondCostIsNotNull() {
            addCriterion("second_cost is not null");
            return (Criteria) this;
        }

        public Criteria andSecondCostEqualTo(Double value) {
            addCriterion("second_cost =", value, "secondCost");
            return (Criteria) this;
        }

        public Criteria andSecondCostNotEqualTo(Double value) {
            addCriterion("second_cost <>", value, "secondCost");
            return (Criteria) this;
        }

        public Criteria andSecondCostGreaterThan(Double value) {
            addCriterion("second_cost >", value, "secondCost");
            return (Criteria) this;
        }

        public Criteria andSecondCostGreaterThanOrEqualTo(Double value) {
            addCriterion("second_cost >=", value, "secondCost");
            return (Criteria) this;
        }

        public Criteria andSecondCostLessThan(Double value) {
            addCriterion("second_cost <", value, "secondCost");
            return (Criteria) this;
        }

        public Criteria andSecondCostLessThanOrEqualTo(Double value) {
            addCriterion("second_cost <=", value, "secondCost");
            return (Criteria) this;
        }

        public Criteria andSecondCostIn(List<Double> values) {
            addCriterion("second_cost in", values, "secondCost");
            return (Criteria) this;
        }

        public Criteria andSecondCostNotIn(List<Double> values) {
            addCriterion("second_cost not in", values, "secondCost");
            return (Criteria) this;
        }

        public Criteria andSecondCostBetween(Double value1, Double value2) {
            addCriterion("second_cost between", value1, value2, "secondCost");
            return (Criteria) this;
        }

        public Criteria andSecondCostNotBetween(Double value1, Double value2) {
            addCriterion("second_cost not between", value1, value2, "secondCost");
            return (Criteria) this;
        }

        public Criteria andFlagIsNull() {
            addCriterion("flag is null");
            return (Criteria) this;
        }

        public Criteria andFlagIsNotNull() {
            addCriterion("flag is not null");
            return (Criteria) this;
        }

        public Criteria andFlagEqualTo(String value) {
            addCriterion("flag =", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagNotEqualTo(String value) {
            addCriterion("flag <>", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagGreaterThan(String value) {
            addCriterion("flag >", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagGreaterThanOrEqualTo(String value) {
            addCriterion("flag >=", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagLessThan(String value) {
            addCriterion("flag <", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagLessThanOrEqualTo(String value) {
            addCriterion("flag <=", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagLike(String value) {
            addCriterion("flag like", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagNotLike(String value) {
            addCriterion("flag not like", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagIn(List<String> values) {
            addCriterion("flag in", values, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagNotIn(List<String> values) {
            addCriterion("flag not in", values, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagBetween(String value1, String value2) {
            addCriterion("flag between", value1, value2, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagNotBetween(String value1, String value2) {
            addCriterion("flag not between", value1, value2, "flag");
            return (Criteria) this;
        }

        public Criteria andFloorIsNull() {
            addCriterion("floor is null");
            return (Criteria) this;
        }

        public Criteria andFloorIsNotNull() {
            addCriterion("floor is not null");
            return (Criteria) this;
        }

        public Criteria andFloorEqualTo(Integer value) {
            addCriterion("floor =", value, "floor");
            return (Criteria) this;
        }

        public Criteria andFloorNotEqualTo(Integer value) {
            addCriterion("floor <>", value, "floor");
            return (Criteria) this;
        }

        public Criteria andFloorGreaterThan(Integer value) {
            addCriterion("floor >", value, "floor");
            return (Criteria) this;
        }

        public Criteria andFloorGreaterThanOrEqualTo(Integer value) {
            addCriterion("floor >=", value, "floor");
            return (Criteria) this;
        }

        public Criteria andFloorLessThan(Integer value) {
            addCriterion("floor <", value, "floor");
            return (Criteria) this;
        }

        public Criteria andFloorLessThanOrEqualTo(Integer value) {
            addCriterion("floor <=", value, "floor");
            return (Criteria) this;
        }

        public Criteria andFloorIn(List<Integer> values) {
            addCriterion("floor in", values, "floor");
            return (Criteria) this;
        }

        public Criteria andFloorNotIn(List<Integer> values) {
            addCriterion("floor not in", values, "floor");
            return (Criteria) this;
        }

        public Criteria andFloorBetween(Integer value1, Integer value2) {
            addCriterion("floor between", value1, value2, "floor");
            return (Criteria) this;
        }

        public Criteria andFloorNotBetween(Integer value1, Integer value2) {
            addCriterion("floor not between", value1, value2, "floor");
            return (Criteria) this;
        }

        public Criteria andMakeUpIsNull() {
            addCriterion("make_up is null");
            return (Criteria) this;
        }

        public Criteria andMakeUpIsNotNull() {
            addCriterion("make_up is not null");
            return (Criteria) this;
        }

        public Criteria andMakeUpEqualTo(Integer value) {
            addCriterion("make_up =", value, "makeUp");
            return (Criteria) this;
        }

        public Criteria andMakeUpNotEqualTo(Integer value) {
            addCriterion("make_up <>", value, "makeUp");
            return (Criteria) this;
        }

        public Criteria andMakeUpGreaterThan(Integer value) {
            addCriterion("make_up >", value, "makeUp");
            return (Criteria) this;
        }

        public Criteria andMakeUpGreaterThanOrEqualTo(Integer value) {
            addCriterion("make_up >=", value, "makeUp");
            return (Criteria) this;
        }

        public Criteria andMakeUpLessThan(Integer value) {
            addCriterion("make_up <", value, "makeUp");
            return (Criteria) this;
        }

        public Criteria andMakeUpLessThanOrEqualTo(Integer value) {
            addCriterion("make_up <=", value, "makeUp");
            return (Criteria) this;
        }

        public Criteria andMakeUpIn(List<Integer> values) {
            addCriterion("make_up in", values, "makeUp");
            return (Criteria) this;
        }

        public Criteria andMakeUpNotIn(List<Integer> values) {
            addCriterion("make_up not in", values, "makeUp");
            return (Criteria) this;
        }

        public Criteria andMakeUpBetween(Integer value1, Integer value2) {
            addCriterion("make_up between", value1, value2, "makeUp");
            return (Criteria) this;
        }

        public Criteria andMakeUpNotBetween(Integer value1, Integer value2) {
            addCriterion("make_up not between", value1, value2, "makeUp");
            return (Criteria) this;
        }

        public Criteria andPhotoIsNull() {
            addCriterion("photo is null");
            return (Criteria) this;
        }

        public Criteria andPhotoIsNotNull() {
            addCriterion("photo is not null");
            return (Criteria) this;
        }

        public Criteria andPhotoEqualTo(Integer value) {
            addCriterion("photo =", value, "photo");
            return (Criteria) this;
        }

        public Criteria andPhotoNotEqualTo(Integer value) {
            addCriterion("photo <>", value, "photo");
            return (Criteria) this;
        }

        public Criteria andPhotoGreaterThan(Integer value) {
            addCriterion("photo >", value, "photo");
            return (Criteria) this;
        }

        public Criteria andPhotoGreaterThanOrEqualTo(Integer value) {
            addCriterion("photo >=", value, "photo");
            return (Criteria) this;
        }

        public Criteria andPhotoLessThan(Integer value) {
            addCriterion("photo <", value, "photo");
            return (Criteria) this;
        }

        public Criteria andPhotoLessThanOrEqualTo(Integer value) {
            addCriterion("photo <=", value, "photo");
            return (Criteria) this;
        }

        public Criteria andPhotoIn(List<Integer> values) {
            addCriterion("photo in", values, "photo");
            return (Criteria) this;
        }

        public Criteria andPhotoNotIn(List<Integer> values) {
            addCriterion("photo not in", values, "photo");
            return (Criteria) this;
        }

        public Criteria andPhotoBetween(Integer value1, Integer value2) {
            addCriterion("photo between", value1, value2, "photo");
            return (Criteria) this;
        }

        public Criteria andPhotoNotBetween(Integer value1, Integer value2) {
            addCriterion("photo not between", value1, value2, "photo");
            return (Criteria) this;
        }

        public Criteria andPsIsNull() {
            addCriterion("ps is null");
            return (Criteria) this;
        }

        public Criteria andPsIsNotNull() {
            addCriterion("ps is not null");
            return (Criteria) this;
        }

        public Criteria andPsEqualTo(Integer value) {
            addCriterion("ps =", value, "ps");
            return (Criteria) this;
        }

        public Criteria andPsNotEqualTo(Integer value) {
            addCriterion("ps <>", value, "ps");
            return (Criteria) this;
        }

        public Criteria andPsGreaterThan(Integer value) {
            addCriterion("ps >", value, "ps");
            return (Criteria) this;
        }

        public Criteria andPsGreaterThanOrEqualTo(Integer value) {
            addCriterion("ps >=", value, "ps");
            return (Criteria) this;
        }

        public Criteria andPsLessThan(Integer value) {
            addCriterion("ps <", value, "ps");
            return (Criteria) this;
        }

        public Criteria andPsLessThanOrEqualTo(Integer value) {
            addCriterion("ps <=", value, "ps");
            return (Criteria) this;
        }

        public Criteria andPsIn(List<Integer> values) {
            addCriterion("ps in", values, "ps");
            return (Criteria) this;
        }

        public Criteria andPsNotIn(List<Integer> values) {
            addCriterion("ps not in", values, "ps");
            return (Criteria) this;
        }

        public Criteria andPsBetween(Integer value1, Integer value2) {
            addCriterion("ps between", value1, value2, "ps");
            return (Criteria) this;
        }

        public Criteria andPsNotBetween(Integer value1, Integer value2) {
            addCriterion("ps not between", value1, value2, "ps");
            return (Criteria) this;
        }

        public Criteria andChooseIsNull() {
            addCriterion("choose is null");
            return (Criteria) this;
        }

        public Criteria andChooseIsNotNull() {
            addCriterion("choose is not null");
            return (Criteria) this;
        }

        public Criteria andChooseEqualTo(Integer value) {
            addCriterion("choose =", value, "choose");
            return (Criteria) this;
        }

        public Criteria andChooseNotEqualTo(Integer value) {
            addCriterion("choose <>", value, "choose");
            return (Criteria) this;
        }

        public Criteria andChooseGreaterThan(Integer value) {
            addCriterion("choose >", value, "choose");
            return (Criteria) this;
        }

        public Criteria andChooseGreaterThanOrEqualTo(Integer value) {
            addCriterion("choose >=", value, "choose");
            return (Criteria) this;
        }

        public Criteria andChooseLessThan(Integer value) {
            addCriterion("choose <", value, "choose");
            return (Criteria) this;
        }

        public Criteria andChooseLessThanOrEqualTo(Integer value) {
            addCriterion("choose <=", value, "choose");
            return (Criteria) this;
        }

        public Criteria andChooseIn(List<Integer> values) {
            addCriterion("choose in", values, "choose");
            return (Criteria) this;
        }

        public Criteria andChooseNotIn(List<Integer> values) {
            addCriterion("choose not in", values, "choose");
            return (Criteria) this;
        }

        public Criteria andChooseBetween(Integer value1, Integer value2) {
            addCriterion("choose between", value1, value2, "choose");
            return (Criteria) this;
        }

        public Criteria andChooseNotBetween(Integer value1, Integer value2) {
            addCriterion("choose not between", value1, value2, "choose");
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