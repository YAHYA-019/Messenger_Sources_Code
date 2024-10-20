package com.facebook.graphql.modelutil;

import X.1BK;
import X.2JZ;
import X.AnonymousClass001;
import X.C23u;
import com.facebook.common.stringformat.StringFormatUtil;

/* loaded from: BaseModel.class */
public abstract class BaseModel extends 2JZ implements C23u {
    public static final Object A00 = new Object();

    /* JADX WARN: Multi-variable type inference failed */
    public String getTypeName() {
        if (isValid()) {
            return super.getTypeName();
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public String toString() {
        return isValid() ? super/*com.facebook.graphservice.tree.TreeJNI*/.toString() : StringFormatUtil.formatStrLocaleSafe("%s@%x", AnonymousClass001.A0Y(this), 1BK.A0j(this));
    }
}
