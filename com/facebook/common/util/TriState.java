package com.facebook.common.util;

import X.AnonymousClass001;

/* loaded from: TriState.class */
public enum TriState {
    YES,
    NO,
    UNSET;

    public static TriState fromDbValue(int i) {
        return i != 1 ? i != 2 ? UNSET : NO : YES;
    }

    public static TriState valueOf(Boolean bool) {
        return bool != null ? valueOf(bool.booleanValue()) : UNSET;
    }

    public static TriState valueOf(boolean z) {
        return z ? YES : NO;
    }

    public boolean asBoolean() {
        int ordinal = ordinal();
        if (ordinal == 0) {
            return true;
        }
        if (ordinal == 1) {
            return false;
        }
        if (ordinal != 2) {
            throw AnonymousClass001.A0N(AnonymousClass001.A0Z(this, "Unrecognized TriState value: ", AnonymousClass001.A0k()));
        }
        throw AnonymousClass001.A0N("No boolean equivalent for UNSET");
    }

    public boolean asBoolean(boolean z) {
        int ordinal = ordinal();
        if (ordinal == 0) {
            return true;
        }
        if (ordinal == 1) {
            z = false;
        } else if (ordinal != 2) {
            throw AnonymousClass001.A0N(AnonymousClass001.A0Z(this, "Unrecognized TriState value: ", AnonymousClass001.A0k()));
        }
        return z;
    }

    public Boolean asBooleanObject() {
        int ordinal = ordinal();
        if (ordinal == 0) {
            return Boolean.TRUE;
        }
        if (ordinal == 1) {
            return Boolean.FALSE;
        }
        if (ordinal == 2) {
            return null;
        }
        throw AnonymousClass001.A0N(AnonymousClass001.A0Z(this, "Unrecognized TriState value: ", AnonymousClass001.A0k()));
    }

    public int getDbValue() {
        int ordinal = ordinal();
        int i = 1;
        if (ordinal != 0) {
            i = 2;
            if (ordinal != 1) {
                i = 3;
            }
        }
        return i;
    }

    public boolean isSet() {
        boolean z = false;
        if (this != UNSET) {
            z = true;
        }
        return z;
    }
}
