package com.google.common.base;

/* loaded from: Functions$IdentityFunction.class */
public enum Functions$IdentityFunction implements Function {
    INSTANCE;

    @Override // com.google.common.base.Function
    public Object apply(Object obj) {
        return obj;
    }

    @Override // java.lang.Enum
    public String toString() {
        return "Functions.identity()";
    }
}
