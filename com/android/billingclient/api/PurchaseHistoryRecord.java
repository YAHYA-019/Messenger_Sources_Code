package com.android.billingclient.api;

import X.DKC;
import android.text.TextUtils;
import org.json.JSONObject;

/* loaded from: PurchaseHistoryRecord.class */
public final class PurchaseHistoryRecord {
    public final String A00;
    public final String A01;
    public final JSONObject A02;

    public PurchaseHistoryRecord(String str, String str2) {
        this.A00 = str;
        this.A01 = str2;
        this.A02 = DKC.A1F(str);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof PurchaseHistoryRecord)) {
                return false;
            }
            PurchaseHistoryRecord purchaseHistoryRecord = (PurchaseHistoryRecord) obj;
            if (!TextUtils.equals(this.A00, purchaseHistoryRecord.A00) || !TextUtils.equals(this.A01, purchaseHistoryRecord.A01)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public String toString() {
        return "PurchaseHistoryRecord. Json: ".concat(String.valueOf(this.A00));
    }
}
