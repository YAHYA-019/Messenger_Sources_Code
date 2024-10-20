package com.facebookpay.offsite.models.message;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

/* loaded from: PaymentDetailsUpdatedError.class */
public final class PaymentDetailsUpdatedError extends HashMap {
    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ boolean containsKey(Object obj) {
        if (obj instanceof String) {
            return super.containsKey(obj);
        }
        return false;
    }

    public /* bridge */ boolean containsKey(String str) {
        return super.containsKey((Object) str);
    }

    public /* bridge */ boolean containsValue(PaymentDataError paymentDataError) {
        return super.containsValue((Object) paymentDataError);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ boolean containsValue(Object obj) {
        if (obj instanceof PaymentDataError) {
            return super.containsValue(obj);
        }
        return false;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ Set entrySet() {
        return super.entrySet();
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ PaymentDataError get(Object obj) {
        if (obj instanceof String) {
            return (PaymentDataError) super.get(obj);
        }
        return null;
    }

    public /* bridge */ PaymentDataError get(String str) {
        return (PaymentDataError) super.get((Object) str);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        if (obj instanceof String) {
            return super.get(obj);
        }
        return null;
    }

    public /* bridge */ Set getEntries() {
        return super.entrySet();
    }

    public /* bridge */ Set getKeys() {
        return super.keySet();
    }

    public final /* bridge */ PaymentDataError getOrDefault(Object obj, PaymentDataError paymentDataError) {
        return !(obj instanceof String) ? paymentDataError : (PaymentDataError) super.getOrDefault(obj, (Object) paymentDataError);
    }

    public /* bridge */ PaymentDataError getOrDefault(String str, PaymentDataError paymentDataError) {
        return (PaymentDataError) super.getOrDefault((Object) str, (String) paymentDataError);
    }

    @Override // java.util.HashMap, java.util.Map
    public final /* bridge */ /* synthetic */ Object getOrDefault(Object obj, Object obj2) {
        return !(obj instanceof String) ? obj2 : super.getOrDefault(obj, obj2);
    }

    public /* bridge */ int getSize() {
        return super.size();
    }

    public /* bridge */ Collection getValues() {
        return super.values();
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ Set keySet() {
        return super.keySet();
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ PaymentDataError remove(Object obj) {
        if (obj instanceof String) {
            return (PaymentDataError) super.remove(obj);
        }
        return null;
    }

    public /* bridge */ PaymentDataError remove(String str) {
        return (PaymentDataError) super.remove((Object) str);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ /* synthetic */ Object remove(Object obj) {
        if (obj instanceof String) {
            return super.remove(obj);
        }
        return null;
    }

    @Override // java.util.HashMap, java.util.Map
    public final /* bridge */ boolean remove(Object obj, Object obj2) {
        boolean z = false;
        if ((obj instanceof String) && (obj2 instanceof PaymentDataError)) {
            z = super.remove(obj, obj2);
        }
        return z;
    }

    public /* bridge */ boolean remove(String str, PaymentDataError paymentDataError) {
        return super.remove((Object) str, (Object) paymentDataError);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ int size() {
        return super.size();
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ Collection values() {
        return super.values();
    }
}
