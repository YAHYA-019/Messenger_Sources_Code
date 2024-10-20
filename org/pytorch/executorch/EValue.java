package org.pytorch.executorch;

import X.AnonymousClass001;
import X.DKC;
import java.util.Locale;
import java.util.Optional;

/* loaded from: EValue.class */
public class EValue {
    public String[] A00 = {"None", "Tensor", "String", "Double", "Int", "Bool", "ListBool", "ListDouble", "ListInt", "ListTensor", "ListScalar", "ListOptionalScalar"};
    public Object mData;
    public final int mTypeCode;

    public EValue(int i) {
        this.mTypeCode = i;
    }

    private void A00(int i, int i2) {
        if (i2 == i) {
            return;
        }
        Locale locale = Locale.US;
        String[] strArr = this.A00;
        throw AnonymousClass001.A0N(String.format(locale, "Expected EValue type %s, actual type %s", strArr[i], (i2 < 0 || i2 >= 12) ? "Unknown" : strArr[i2]));
    }

    public static EValue from(double d) {
        EValue eValue = new EValue(3);
        eValue.mData = Double.valueOf(d);
        return eValue;
    }

    public static EValue from(long j) {
        EValue eValue = new EValue(4);
        eValue.mData = Long.valueOf(j);
        return eValue;
    }

    public static EValue from(String str) {
        EValue eValue = new EValue(2);
        eValue.mData = str;
        return eValue;
    }

    public static EValue from(Tensor tensor) {
        EValue eValue = new EValue(1);
        eValue.mData = tensor;
        return eValue;
    }

    public static EValue from(boolean z) {
        EValue eValue = new EValue(5);
        eValue.mData = Boolean.valueOf(z);
        return eValue;
    }

    public static EValue listFrom(double... dArr) {
        EValue eValue = new EValue(7);
        eValue.mData = dArr;
        return eValue;
    }

    public static EValue listFrom(long... jArr) {
        EValue eValue = new EValue(8);
        eValue.mData = jArr;
        return eValue;
    }

    public static EValue listFrom(Optional... optionalArr) {
        EValue eValue = new EValue(11);
        eValue.mData = optionalArr;
        return eValue;
    }

    public static EValue listFrom(Tensor... tensorArr) {
        EValue eValue = new EValue(9);
        eValue.mData = tensorArr;
        return eValue;
    }

    public static EValue listFrom(boolean... zArr) {
        EValue eValue = new EValue(6);
        eValue.mData = zArr;
        return eValue;
    }

    public static EValue optionalNone() {
        return new EValue(0);
    }

    public boolean isBool() {
        return AnonymousClass001.A1Q(5, this.mTypeCode);
    }

    public boolean isBoolList() {
        return AnonymousClass001.A1Q(6, this.mTypeCode);
    }

    public boolean isDouble() {
        return AnonymousClass001.A1Q(3, this.mTypeCode);
    }

    public boolean isDoubleList() {
        return AnonymousClass001.A1Q(7, this.mTypeCode);
    }

    public boolean isInt() {
        return AnonymousClass001.A1Q(4, this.mTypeCode);
    }

    public boolean isIntList() {
        return AnonymousClass001.A1Q(8, this.mTypeCode);
    }

    public boolean isNone() {
        return AnonymousClass001.A1O(this.mTypeCode);
    }

    public boolean isOptionalTensorList() {
        return AnonymousClass001.A1Q(11, this.mTypeCode);
    }

    public boolean isString() {
        return AnonymousClass001.A1Q(2, this.mTypeCode);
    }

    public boolean isTensor() {
        boolean z = true;
        if (1 != this.mTypeCode) {
            z = false;
        }
        return z;
    }

    public boolean isTensorList() {
        return AnonymousClass001.A1Q(9, this.mTypeCode);
    }

    public boolean toBool() {
        A00(5, this.mTypeCode);
        return AnonymousClass001.A1V(this.mData);
    }

    public boolean[] toBoolList() {
        A00(6, this.mTypeCode);
        return (boolean[]) this.mData;
    }

    public double toDouble() {
        A00(3, this.mTypeCode);
        return DKC.A00(this.mData);
    }

    public double[] toDoubleList() {
        A00(7, this.mTypeCode);
        return (double[]) this.mData;
    }

    public long toInt() {
        A00(4, this.mTypeCode);
        return AnonymousClass001.A05(this.mData);
    }

    public long[] toIntList() {
        A00(8, this.mTypeCode);
        return (long[]) this.mData;
    }

    public String toStr() {
        A00(2, this.mTypeCode);
        return (String) this.mData;
    }

    public Tensor toTensor() {
        A00(1, this.mTypeCode);
        return (Tensor) this.mData;
    }

    public Tensor[] toTensorList() {
        A00(9, this.mTypeCode);
        return (Tensor[]) this.mData;
    }
}
