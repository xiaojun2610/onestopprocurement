package com.huaxin.onestopprocurement.po;

import java.util.ArrayList;
import java.util.List;

public class ItemExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ItemExample() {
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

        public Criteria andItemIdIsNull() {
            addCriterion("item-id is null");
            return (Criteria) this;
        }

        public Criteria andItemIdIsNotNull() {
            addCriterion("item-id is not null");
            return (Criteria) this;
        }

        public Criteria andItemIdEqualTo(Integer value) {
            addCriterion("item-id =", value, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdNotEqualTo(Integer value) {
            addCriterion("item-id <>", value, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdGreaterThan(Integer value) {
            addCriterion("item-id >", value, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("item-id >=", value, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdLessThan(Integer value) {
            addCriterion("item-id <", value, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdLessThanOrEqualTo(Integer value) {
            addCriterion("item-id <=", value, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdIn(List<Integer> values) {
            addCriterion("item-id in", values, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdNotIn(List<Integer> values) {
            addCriterion("item-id not in", values, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdBetween(Integer value1, Integer value2) {
            addCriterion("item-id between", value1, value2, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdNotBetween(Integer value1, Integer value2) {
            addCriterion("item-id not between", value1, value2, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemNameIsNull() {
            addCriterion("item-name is null");
            return (Criteria) this;
        }

        public Criteria andItemNameIsNotNull() {
            addCriterion("item-name is not null");
            return (Criteria) this;
        }

        public Criteria andItemNameEqualTo(String value) {
            addCriterion("item-name =", value, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemNameNotEqualTo(String value) {
            addCriterion("item-name <>", value, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemNameGreaterThan(String value) {
            addCriterion("item-name >", value, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemNameGreaterThanOrEqualTo(String value) {
            addCriterion("item-name >=", value, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemNameLessThan(String value) {
            addCriterion("item-name <", value, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemNameLessThanOrEqualTo(String value) {
            addCriterion("item-name <=", value, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemNameLike(String value) {
            addCriterion("item-name like", value, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemNameNotLike(String value) {
            addCriterion("item-name not like", value, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemNameIn(List<String> values) {
            addCriterion("item-name in", values, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemNameNotIn(List<String> values) {
            addCriterion("item-name not in", values, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemNameBetween(String value1, String value2) {
            addCriterion("item-name between", value1, value2, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemNameNotBetween(String value1, String value2) {
            addCriterion("item-name not between", value1, value2, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemClassIsNull() {
            addCriterion("item-class is null");
            return (Criteria) this;
        }

        public Criteria andItemClassIsNotNull() {
            addCriterion("item-class is not null");
            return (Criteria) this;
        }

        public Criteria andItemClassEqualTo(Integer value) {
            addCriterion("item-class =", value, "itemClass");
            return (Criteria) this;
        }

        public Criteria andItemClassNotEqualTo(Integer value) {
            addCriterion("item-class <>", value, "itemClass");
            return (Criteria) this;
        }

        public Criteria andItemClassGreaterThan(Integer value) {
            addCriterion("item-class >", value, "itemClass");
            return (Criteria) this;
        }

        public Criteria andItemClassGreaterThanOrEqualTo(Integer value) {
            addCriterion("item-class >=", value, "itemClass");
            return (Criteria) this;
        }

        public Criteria andItemClassLessThan(Integer value) {
            addCriterion("item-class <", value, "itemClass");
            return (Criteria) this;
        }

        public Criteria andItemClassLessThanOrEqualTo(Integer value) {
            addCriterion("item-class <=", value, "itemClass");
            return (Criteria) this;
        }

        public Criteria andItemClassIn(List<Integer> values) {
            addCriterion("item-class in", values, "itemClass");
            return (Criteria) this;
        }

        public Criteria andItemClassNotIn(List<Integer> values) {
            addCriterion("item-class not in", values, "itemClass");
            return (Criteria) this;
        }

        public Criteria andItemClassBetween(Integer value1, Integer value2) {
            addCriterion("item-class between", value1, value2, "itemClass");
            return (Criteria) this;
        }

        public Criteria andItemClassNotBetween(Integer value1, Integer value2) {
            addCriterion("item-class not between", value1, value2, "itemClass");
            return (Criteria) this;
        }

        public Criteria andItemDescIsNull() {
            addCriterion("item-desc is null");
            return (Criteria) this;
        }

        public Criteria andItemDescIsNotNull() {
            addCriterion("item-desc is not null");
            return (Criteria) this;
        }

        public Criteria andItemDescEqualTo(String value) {
            addCriterion("item-desc =", value, "itemDesc");
            return (Criteria) this;
        }

        public Criteria andItemDescNotEqualTo(String value) {
            addCriterion("item-desc <>", value, "itemDesc");
            return (Criteria) this;
        }

        public Criteria andItemDescGreaterThan(String value) {
            addCriterion("item-desc >", value, "itemDesc");
            return (Criteria) this;
        }

        public Criteria andItemDescGreaterThanOrEqualTo(String value) {
            addCriterion("item-desc >=", value, "itemDesc");
            return (Criteria) this;
        }

        public Criteria andItemDescLessThan(String value) {
            addCriterion("item-desc <", value, "itemDesc");
            return (Criteria) this;
        }

        public Criteria andItemDescLessThanOrEqualTo(String value) {
            addCriterion("item-desc <=", value, "itemDesc");
            return (Criteria) this;
        }

        public Criteria andItemDescLike(String value) {
            addCriterion("item-desc like", value, "itemDesc");
            return (Criteria) this;
        }

        public Criteria andItemDescNotLike(String value) {
            addCriterion("item-desc not like", value, "itemDesc");
            return (Criteria) this;
        }

        public Criteria andItemDescIn(List<String> values) {
            addCriterion("item-desc in", values, "itemDesc");
            return (Criteria) this;
        }

        public Criteria andItemDescNotIn(List<String> values) {
            addCriterion("item-desc not in", values, "itemDesc");
            return (Criteria) this;
        }

        public Criteria andItemDescBetween(String value1, String value2) {
            addCriterion("item-desc between", value1, value2, "itemDesc");
            return (Criteria) this;
        }

        public Criteria andItemDescNotBetween(String value1, String value2) {
            addCriterion("item-desc not between", value1, value2, "itemDesc");
            return (Criteria) this;
        }

        public Criteria andItemPriceIsNull() {
            addCriterion("item-price is null");
            return (Criteria) this;
        }

        public Criteria andItemPriceIsNotNull() {
            addCriterion("item-price is not null");
            return (Criteria) this;
        }

        public Criteria andItemPriceEqualTo(Integer value) {
            addCriterion("item-price =", value, "itemPrice");
            return (Criteria) this;
        }

        public Criteria andItemPriceNotEqualTo(Integer value) {
            addCriterion("item-price <>", value, "itemPrice");
            return (Criteria) this;
        }

        public Criteria andItemPriceGreaterThan(Integer value) {
            addCriterion("item-price >", value, "itemPrice");
            return (Criteria) this;
        }

        public Criteria andItemPriceGreaterThanOrEqualTo(Integer value) {
            addCriterion("item-price >=", value, "itemPrice");
            return (Criteria) this;
        }

        public Criteria andItemPriceLessThan(Integer value) {
            addCriterion("item-price <", value, "itemPrice");
            return (Criteria) this;
        }

        public Criteria andItemPriceLessThanOrEqualTo(Integer value) {
            addCriterion("item-price <=", value, "itemPrice");
            return (Criteria) this;
        }

        public Criteria andItemPriceIn(List<Integer> values) {
            addCriterion("item-price in", values, "itemPrice");
            return (Criteria) this;
        }

        public Criteria andItemPriceNotIn(List<Integer> values) {
            addCriterion("item-price not in", values, "itemPrice");
            return (Criteria) this;
        }

        public Criteria andItemPriceBetween(Integer value1, Integer value2) {
            addCriterion("item-price between", value1, value2, "itemPrice");
            return (Criteria) this;
        }

        public Criteria andItemPriceNotBetween(Integer value1, Integer value2) {
            addCriterion("item-price not between", value1, value2, "itemPrice");
            return (Criteria) this;
        }

        public Criteria andItemDiscountIsNull() {
            addCriterion("item-discount is null");
            return (Criteria) this;
        }

        public Criteria andItemDiscountIsNotNull() {
            addCriterion("item-discount is not null");
            return (Criteria) this;
        }

        public Criteria andItemDiscountEqualTo(Long value) {
            addCriterion("item-discount =", value, "itemDiscount");
            return (Criteria) this;
        }

        public Criteria andItemDiscountNotEqualTo(Long value) {
            addCriterion("item-discount <>", value, "itemDiscount");
            return (Criteria) this;
        }

        public Criteria andItemDiscountGreaterThan(Long value) {
            addCriterion("item-discount >", value, "itemDiscount");
            return (Criteria) this;
        }

        public Criteria andItemDiscountGreaterThanOrEqualTo(Long value) {
            addCriterion("item-discount >=", value, "itemDiscount");
            return (Criteria) this;
        }

        public Criteria andItemDiscountLessThan(Long value) {
            addCriterion("item-discount <", value, "itemDiscount");
            return (Criteria) this;
        }

        public Criteria andItemDiscountLessThanOrEqualTo(Long value) {
            addCriterion("item-discount <=", value, "itemDiscount");
            return (Criteria) this;
        }

        public Criteria andItemDiscountIn(List<Long> values) {
            addCriterion("item-discount in", values, "itemDiscount");
            return (Criteria) this;
        }

        public Criteria andItemDiscountNotIn(List<Long> values) {
            addCriterion("item-discount not in", values, "itemDiscount");
            return (Criteria) this;
        }

        public Criteria andItemDiscountBetween(Long value1, Long value2) {
            addCriterion("item-discount between", value1, value2, "itemDiscount");
            return (Criteria) this;
        }

        public Criteria andItemDiscountNotBetween(Long value1, Long value2) {
            addCriterion("item-discount not between", value1, value2, "itemDiscount");
            return (Criteria) this;
        }

        public Criteria andItemImgIsNull() {
            addCriterion("item-img is null");
            return (Criteria) this;
        }

        public Criteria andItemImgIsNotNull() {
            addCriterion("item-img is not null");
            return (Criteria) this;
        }

        public Criteria andItemImgEqualTo(String value) {
            addCriterion("item-img =", value, "itemImg");
            return (Criteria) this;
        }

        public Criteria andItemImgNotEqualTo(String value) {
            addCriterion("item-img <>", value, "itemImg");
            return (Criteria) this;
        }

        public Criteria andItemImgGreaterThan(String value) {
            addCriterion("item-img >", value, "itemImg");
            return (Criteria) this;
        }

        public Criteria andItemImgGreaterThanOrEqualTo(String value) {
            addCriterion("item-img >=", value, "itemImg");
            return (Criteria) this;
        }

        public Criteria andItemImgLessThan(String value) {
            addCriterion("item-img <", value, "itemImg");
            return (Criteria) this;
        }

        public Criteria andItemImgLessThanOrEqualTo(String value) {
            addCriterion("item-img <=", value, "itemImg");
            return (Criteria) this;
        }

        public Criteria andItemImgLike(String value) {
            addCriterion("item-img like", value, "itemImg");
            return (Criteria) this;
        }

        public Criteria andItemImgNotLike(String value) {
            addCriterion("item-img not like", value, "itemImg");
            return (Criteria) this;
        }

        public Criteria andItemImgIn(List<String> values) {
            addCriterion("item-img in", values, "itemImg");
            return (Criteria) this;
        }

        public Criteria andItemImgNotIn(List<String> values) {
            addCriterion("item-img not in", values, "itemImg");
            return (Criteria) this;
        }

        public Criteria andItemImgBetween(String value1, String value2) {
            addCriterion("item-img between", value1, value2, "itemImg");
            return (Criteria) this;
        }

        public Criteria andItemImgNotBetween(String value1, String value2) {
            addCriterion("item-img not between", value1, value2, "itemImg");
            return (Criteria) this;
        }

        public Criteria andItemCountIsNull() {
            addCriterion("item-count is null");
            return (Criteria) this;
        }

        public Criteria andItemCountIsNotNull() {
            addCriterion("item-count is not null");
            return (Criteria) this;
        }

        public Criteria andItemCountEqualTo(Integer value) {
            addCriterion("item-count =", value, "itemCount");
            return (Criteria) this;
        }

        public Criteria andItemCountNotEqualTo(Integer value) {
            addCriterion("item-count <>", value, "itemCount");
            return (Criteria) this;
        }

        public Criteria andItemCountGreaterThan(Integer value) {
            addCriterion("item-count >", value, "itemCount");
            return (Criteria) this;
        }

        public Criteria andItemCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("item-count >=", value, "itemCount");
            return (Criteria) this;
        }

        public Criteria andItemCountLessThan(Integer value) {
            addCriterion("item-count <", value, "itemCount");
            return (Criteria) this;
        }

        public Criteria andItemCountLessThanOrEqualTo(Integer value) {
            addCriterion("item-count <=", value, "itemCount");
            return (Criteria) this;
        }

        public Criteria andItemCountIn(List<Integer> values) {
            addCriterion("item-count in", values, "itemCount");
            return (Criteria) this;
        }

        public Criteria andItemCountNotIn(List<Integer> values) {
            addCriterion("item-count not in", values, "itemCount");
            return (Criteria) this;
        }

        public Criteria andItemCountBetween(Integer value1, Integer value2) {
            addCriterion("item-count between", value1, value2, "itemCount");
            return (Criteria) this;
        }

        public Criteria andItemCountNotBetween(Integer value1, Integer value2) {
            addCriterion("item-count not between", value1, value2, "itemCount");
            return (Criteria) this;
        }

        public Criteria andItemClickcountIsNull() {
            addCriterion("item-clickCount is null");
            return (Criteria) this;
        }

        public Criteria andItemClickcountIsNotNull() {
            addCriterion("item-clickCount is not null");
            return (Criteria) this;
        }

        public Criteria andItemClickcountEqualTo(Integer value) {
            addCriterion("item-clickCount =", value, "itemClickcount");
            return (Criteria) this;
        }

        public Criteria andItemClickcountNotEqualTo(Integer value) {
            addCriterion("item-clickCount <>", value, "itemClickcount");
            return (Criteria) this;
        }

        public Criteria andItemClickcountGreaterThan(Integer value) {
            addCriterion("item-clickCount >", value, "itemClickcount");
            return (Criteria) this;
        }

        public Criteria andItemClickcountGreaterThanOrEqualTo(Integer value) {
            addCriterion("item-clickCount >=", value, "itemClickcount");
            return (Criteria) this;
        }

        public Criteria andItemClickcountLessThan(Integer value) {
            addCriterion("item-clickCount <", value, "itemClickcount");
            return (Criteria) this;
        }

        public Criteria andItemClickcountLessThanOrEqualTo(Integer value) {
            addCriterion("item-clickCount <=", value, "itemClickcount");
            return (Criteria) this;
        }

        public Criteria andItemClickcountIn(List<Integer> values) {
            addCriterion("item-clickCount in", values, "itemClickcount");
            return (Criteria) this;
        }

        public Criteria andItemClickcountNotIn(List<Integer> values) {
            addCriterion("item-clickCount not in", values, "itemClickcount");
            return (Criteria) this;
        }

        public Criteria andItemClickcountBetween(Integer value1, Integer value2) {
            addCriterion("item-clickCount between", value1, value2, "itemClickcount");
            return (Criteria) this;
        }

        public Criteria andItemClickcountNotBetween(Integer value1, Integer value2) {
            addCriterion("item-clickCount not between", value1, value2, "itemClickcount");
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