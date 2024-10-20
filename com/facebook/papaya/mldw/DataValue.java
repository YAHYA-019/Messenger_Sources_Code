package com.facebook.papaya.mldw;

import X.AnonymousClass001;
import X.C0il;
import X.DKG;
import X.KOj;
import java.util.Locale;

/* loaded from: DataValue.class */
public final class DataValue {
    public static final DataValue $redex_init_class = null;
    public KOj mDataType;
    public Float mFloatValue;
    public Long mIntValue;
    public boolean mIsNull;
    public String mStringValue;

    static {
        C0il.A0B("papaya-mldw");
    }

    public DataValue() {
        this.mIsNull = true;
        this.mDataType = KOj.A03;
        this.mIntValue = null;
        this.mFloatValue = null;
        this.mStringValue = null;
        this.mIsNull = true;
    }

    public DataValue(Float f) {
        this.mIsNull = true;
        this.mDataType = KOj.A03;
        this.mIntValue = null;
        this.mFloatValue = null;
        this.mStringValue = null;
        this.mIsNull = false;
        this.mDataType = KOj.A02;
        this.mFloatValue = f;
    }

    public DataValue(Long l) {
        this.mIsNull = true;
        KOj kOj = KOj.A03;
        this.mDataType = kOj;
        this.mIntValue = null;
        this.mFloatValue = null;
        this.mStringValue = null;
        this.mIsNull = false;
        this.mDataType = kOj;
        this.mIntValue = l;
    }

    public DataValue(String str) {
        this.mIsNull = true;
        this.mDataType = KOj.A03;
        this.mIntValue = null;
        this.mFloatValue = null;
        this.mStringValue = null;
        this.mIsNull = false;
        this.mDataType = KOj.A04;
        this.mStringValue = str;
    }

    private void checkIsNotNull() {
        if (this.mIsNull) {
            throw AnonymousClass001.A0T("The data value is null!");
        }
    }

    private void checkType(KOj kOj) {
        KOj kOj2 = this.mDataType;
        if (kOj2 != kOj) {
            throw AnonymousClass001.A0T(String.format(Locale.US, "Trying to access %s as %s!", DKG.A1b(kOj, kOj2.toString())));
        }
    }

    private int getDataTypeValue() {
        checkIsNotNull();
        return this.mDataType.value;
    }

    public KOj getDataType() {
        checkIsNotNull();
        return this.mDataType;
    }

    public float getFloatValue() {
        checkIsNotNull();
        checkType(KOj.A02);
        Float f = this.mFloatValue;
        f.getClass();
        return f.floatValue();
    }

    public long getIntValue() {
        checkIsNotNull();
        checkType(KOj.A03);
        Long l = this.mIntValue;
        l.getClass();
        return l.longValue();
    }

    public boolean getIsNull() {
        return this.mIsNull;
    }

    public String getStringValue() {
        checkIsNotNull();
        checkType(KOj.A04);
        String str = this.mStringValue;
        str.getClass();
        return str;
    }
}
