package com.google.common.base;

/* loaded from: Functions$ToStringFunction.class */
public enum Functions$ToStringFunction implements Function {
    INSTANCE;

    @Override // com.google.common.base.Function
    public /* bridge */ /* synthetic */ Object apply(Object obj) {
        obj.getClass();
        return obj.toString();
    }

    @Override // java.lang.Enum
    public String toString() {
        return "Functions.toStringFunction()";
    }
}
