package com.google.common.collect;

import com.google.common.base.Function;
import java.util.Map;

/* JADX WARN: $VALUES field not found */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: Maps$EntryFunction.class */
public abstract class Maps$EntryFunction implements Function {
    public static final Maps$EntryFunction A00 = new Maps$EntryFunction() { // from class: com.google.common.collect.Maps$EntryFunction.1
        @Override // com.google.common.base.Function
        public /* bridge */ /* synthetic */ Object apply(Object obj) {
            return ((Map.Entry) obj).getKey();
        }
    };
    public static final Maps$EntryFunction A01 = new Maps$EntryFunction() { // from class: com.google.common.collect.Maps$EntryFunction.2
        @Override // com.google.common.base.Function
        public /* bridge */ /* synthetic */ Object apply(Object obj) {
            return ((Map.Entry) obj).getValue();
        }
    };

    public Maps$EntryFunction(String str, int i) {
    }
}
