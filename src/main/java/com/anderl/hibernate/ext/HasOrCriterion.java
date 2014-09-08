package com.anderl.hibernate.ext;

import java.util.List;

/**
 * Created by ga2unte on 8.9.2014.
 */
public interface HasOrCriterion<T> {

    default List<HibernateCriterionOrWrapper> getOrCriterions() {
        return Helper.invokeGettersByReturnType(HibernateCriterionOrWrapper.class, this);
    }
}
