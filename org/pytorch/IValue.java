package org.pytorch;

import X.AnonymousClass001;
import X.DKC;
import java.util.Locale;
import java.util.Map;

/* loaded from: IValue.class */
public class IValue {
    public String[] TYPE_NAMES = {"Unknown", "Null", "Tensor", "Bool", "Long", "Double", "String", "Tuple", "BoolList", "LongList", "DoubleList", "TensorList", "GenericList", "DictStringKey", "DictLongKey"};
    public Object mData;
    public final int mTypeCode;

    public IValue(int i) {
        this.mTypeCode = i;
    }

    public static IValue dictLongKeyFrom(Map map) {
        IValue iValue = new IValue(14);
        iValue.mData = map;
        return iValue;
    }

    public static IValue dictStringKeyFrom(Map map) {
        IValue iValue = new IValue(13);
        iValue.mData = map;
        return iValue;
    }

    public static IValue from(double d) {
        IValue iValue = new IValue(5);
        iValue.mData = Double.valueOf(d);
        return iValue;
    }

    public static IValue from(long j) {
        IValue iValue = new IValue(4);
        iValue.mData = Long.valueOf(j);
        return iValue;
    }

    public static IValue from(String str) {
        IValue iValue = new IValue(6);
        iValue.mData = str;
        return iValue;
    }

    public static IValue from(Tensor tensor) {
        IValue iValue = new IValue(2);
        iValue.mData = tensor;
        return iValue;
    }

    public static IValue from(boolean z) {
        IValue iValue = new IValue(3);
        iValue.mData = Boolean.valueOf(z);
        return iValue;
    }

    public static IValue listFrom(double... dArr) {
        IValue iValue = new IValue(10);
        iValue.mData = dArr;
        return iValue;
    }

    public static IValue listFrom(long... jArr) {
        IValue iValue = new IValue(9);
        iValue.mData = jArr;
        return iValue;
    }

    public static IValue listFrom(IValue... iValueArr) {
        int length = iValueArr.length;
        if (length > 0) {
            int i = iValueArr[0].mTypeCode;
            int i2 = 1;
            while (true) {
                int i3 = i2;
                if (i3 >= length) {
                    break;
                }
                if (i != iValueArr[i3].mTypeCode) {
                    throw AnonymousClass001.A0L("List must contain items of the same type");
                }
                i2 = i3 + 1;
            }
        }
        IValue iValue = new IValue(12);
        iValue.mData = iValueArr;
        return iValue;
    }

    public static IValue listFrom(Tensor... tensorArr) {
        IValue iValue = new IValue(11);
        iValue.mData = tensorArr;
        return iValue;
    }

    public static IValue listFrom(boolean... zArr) {
        IValue iValue = new IValue(8);
        iValue.mData = zArr;
        return iValue;
    }

    public static IValue optionalNull() {
        return new IValue(1);
    }

    private void preconditionType(int i, int i2) {
        if (i2 == i) {
            return;
        }
        Locale locale = Locale.US;
        String[] strArr = this.TYPE_NAMES;
        int length = strArr.length;
        throw AnonymousClass001.A0N(String.format(locale, "Expected IValue type %s, actual type %s", i < length ? strArr[i] : "Unknown", (i2 < 0 || i2 >= length) ? "Unknown" : strArr[i2]));
    }

    public static IValue tupleFrom(IValue... iValueArr) {
        IValue iValue = new IValue(7);
        iValue.mData = iValueArr;
        return iValue;
    }

    public boolean isBool() {
        return AnonymousClass001.A1Q(3, this.mTypeCode);
    }

    public boolean isBoolList() {
        return AnonymousClass001.A1Q(8, this.mTypeCode);
    }

    public boolean isDictLongKey() {
        return AnonymousClass001.A1Q(14, this.mTypeCode);
    }

    public boolean isDictStringKey() {
        return AnonymousClass001.A1Q(13, this.mTypeCode);
    }

    public boolean isDouble() {
        return AnonymousClass001.A1Q(5, this.mTypeCode);
    }

    public boolean isDoubleList() {
        return AnonymousClass001.A1Q(10, this.mTypeCode);
    }

    public boolean isList() {
        return AnonymousClass001.A1Q(12, this.mTypeCode);
    }

    public boolean isLong() {
        return AnonymousClass001.A1Q(4, this.mTypeCode);
    }

    public boolean isLongList() {
        return AnonymousClass001.A1Q(9, this.mTypeCode);
    }

    public boolean isNull() {
        boolean z = true;
        if (1 != this.mTypeCode) {
            z = false;
        }
        return z;
    }

    public boolean isString() {
        return AnonymousClass001.A1Q(6, this.mTypeCode);
    }

    public boolean isTensor() {
        return AnonymousClass001.A1Q(2, this.mTypeCode);
    }

    public boolean isTensorList() {
        return AnonymousClass001.A1Q(11, this.mTypeCode);
    }

    public boolean isTuple() {
        return AnonymousClass001.A1Q(7, this.mTypeCode);
    }

    public boolean toBool() {
        preconditionType(3, this.mTypeCode);
        return AnonymousClass001.A1V(this.mData);
    }

    public boolean[] toBoolList() {
        preconditionType(8, this.mTypeCode);
        return (boolean[]) this.mData;
    }

    public Map toDictLongKey() {
        preconditionType(14, this.mTypeCode);
        return (Map) this.mData;
    }

    public Map toDictStringKey() {
        preconditionType(13, this.mTypeCode);
        return (Map) this.mData;
    }

    public double toDouble() {
        preconditionType(5, this.mTypeCode);
        return DKC.A00(this.mData);
    }

    public double[] toDoubleList() {
        preconditionType(10, this.mTypeCode);
        return (double[]) this.mData;
    }

    public IValue[] toList() {
        preconditionType(12, this.mTypeCode);
        return (IValue[]) this.mData;
    }

    public long toLong() {
        preconditionType(4, this.mTypeCode);
        return AnonymousClass001.A05(this.mData);
    }

    public long[] toLongList() {
        preconditionType(9, this.mTypeCode);
        return (long[]) this.mData;
    }

    public String toStr() {
        preconditionType(6, this.mTypeCode);
        return (String) this.mData;
    }

    public Tensor toTensor() {
        preconditionType(2, this.mTypeCode);
        return (Tensor) this.mData;
    }

    public Tensor[] toTensorList() {
        preconditionType(11, this.mTypeCode);
        return (Tensor[]) this.mData;
    }

    public IValue[] toTuple() {
        preconditionType(7, this.mTypeCode);
        return (IValue[]) this.mData;
    }
}
