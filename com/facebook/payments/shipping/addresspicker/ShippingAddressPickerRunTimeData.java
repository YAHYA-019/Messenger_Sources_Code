package com.facebook.payments.shipping.addresspicker;

import X.1BK;
import X.1Du;
import X.AbF;
import X.AnonymousClass001;
import X.FKd;
import X.Quy;
import android.content.Intent;
import android.os.Parcelable;
import com.facebook.payments.picker.model.CoreClientData;
import com.facebook.payments.picker.model.SimplePickerRunTimeData;
import com.facebook.payments.shipping.model.MailingAddress;
import com.facebook.payments.shipping.model.SimpleMailingAddress;
import com.google.common.base.Absent;
import com.google.common.base.Optional;
import com.google.common.base.Present;
import com.google.common.collect.ImmutableList;

/* loaded from: ShippingAddressPickerRunTimeData.class */
public final class ShippingAddressPickerRunTimeData extends SimplePickerRunTimeData {
    public static final Parcelable.Creator CREATOR = FKd.A00(88);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v64, types: [android.os.Parcelable] */
    @Override // com.facebook.payments.picker.model.PickerRunTimeData
    public Intent B7x() {
        MailingAddress mailingAddress;
        Intent A05;
        Optional A0a;
        CoreClientData coreClientData = this.A00;
        if (coreClientData == null) {
            return null;
        }
        if (this.A01.shippingParams.shippingSource.ordinal() == 0) {
            Object obj = this.A03.get(Quy.A01);
            1Du it = ((ShippingCoreClientData) coreClientData).A01.iterator();
            while (it.hasNext()) {
                mailingAddress = (MailingAddress) it.next();
                if (((SimpleMailingAddress) mailingAddress).mId.equals(obj)) {
                    A05 = AbF.A05();
                }
            }
            return null;
        }
        ImmutableList immutableList = ((ShippingCoreClientData) coreClientData).A01;
        1Du it2 = immutableList.iterator();
        while (true) {
            if (it2.hasNext()) {
                MailingAddress mailingAddress2 = (MailingAddress) it2.next();
                if (((SimpleMailingAddress) mailingAddress2).mIsDefault) {
                    A0a = new Present(mailingAddress2);
                    break;
                }
            } else {
                A0a = immutableList.isEmpty() ? Absent.INSTANCE : 1BK.A0a(immutableList.get(0));
            }
        }
        A05 = AbF.A05();
        if (A0a.isPresent()) {
            mailingAddress = (Parcelable) A0a.get();
        }
        return A05;
        A05.putExtra("shipping_address", mailingAddress);
        return A05;
    }

    @Override // com.facebook.payments.picker.model.PickerRunTimeData
    public boolean BRb() {
        return AnonymousClass001.A1U(this.A00);
    }
}
