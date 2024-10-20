package com.facebook.payments.decorator;

import X.1BK;
import X.4YT;
import X.4YV;
import X.C53v;
import X.FKZ;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.payments.ui.titlebar.model.PaymentsTitleBarStyle;
import com.facebook.payments.ui.titlebar.model.PaymentsTitleBarTitleStyle;
import com.google.common.base.Absent;
import com.google.common.base.MoreObjects;
import com.google.common.base.Optional;

/* loaded from: PaymentsDecoratorParams.class */
public class PaymentsDecoratorParams implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKZ.A00(46);
    public Optional A00;
    public final boolean isFullScreenModal;
    public final PaymentsDecoratorAnimation paymentsDecoratorAnimation;
    public final String paymentsPayBarButtonText;
    public final String paymentsTitleBarButtonText;
    public final PaymentsTitleBarStyle paymentsTitleBarStyle;
    public final PaymentsTitleBarTitleStyle paymentsTitleBarTitleStyle;

    public PaymentsDecoratorParams() {
        this.paymentsDecoratorAnimation = null;
        this.paymentsTitleBarStyle = PaymentsTitleBarStyle.A03;
        this.paymentsTitleBarTitleStyle = PaymentsTitleBarTitleStyle.A04;
        this.paymentsTitleBarButtonText = null;
        this.paymentsPayBarButtonText = null;
        this.A00 = Absent.INSTANCE;
        this.isFullScreenModal = false;
    }

    public PaymentsDecoratorParams(Parcel parcel) {
        Optional optional;
        this.paymentsDecoratorAnimation = (PaymentsDecoratorAnimation) C53v.A07(parcel, PaymentsDecoratorAnimation.class);
        this.paymentsTitleBarStyle = (PaymentsTitleBarStyle) C53v.A07(parcel, PaymentsTitleBarStyle.class);
        this.paymentsTitleBarTitleStyle = (PaymentsTitleBarTitleStyle) C53v.A07(parcel, PaymentsTitleBarTitleStyle.class);
        this.paymentsTitleBarButtonText = parcel.readString();
        this.paymentsPayBarButtonText = parcel.readString();
        int readInt = parcel.readInt();
        if (readInt == 0) {
            optional = null;
        } else if (readInt == 1) {
            optional = Absent.INSTANCE;
        } else {
            if (readInt != 2) {
                throw 4YV.A0h(4YT.A00(653), readInt);
            }
            optional = 1BK.A0a(C53v.A08(parcel));
        }
        this.A00 = optional;
        this.isFullScreenModal = C53v.A0S(parcel);
    }

    public PaymentsDecoratorParams(PaymentsDecoratorAnimation paymentsDecoratorAnimation, PaymentsTitleBarStyle paymentsTitleBarStyle) {
        paymentsDecoratorAnimation.getClass();
        this.paymentsDecoratorAnimation = paymentsDecoratorAnimation;
        this.paymentsTitleBarStyle = paymentsTitleBarStyle;
        this.paymentsTitleBarTitleStyle = PaymentsTitleBarTitleStyle.A04;
        this.paymentsTitleBarButtonText = null;
        this.paymentsPayBarButtonText = null;
        this.A00 = (Optional) MoreObjects.firstNonNull(null, Absent.INSTANCE);
        this.isFullScreenModal = false;
    }

    public PaymentsDecoratorParams(PaymentsDecoratorAnimation paymentsDecoratorAnimation, PaymentsTitleBarStyle paymentsTitleBarStyle, PaymentsTitleBarTitleStyle paymentsTitleBarTitleStyle, Optional optional, String str, String str2, boolean z) {
        paymentsDecoratorAnimation.getClass();
        this.paymentsDecoratorAnimation = paymentsDecoratorAnimation;
        this.paymentsTitleBarStyle = paymentsTitleBarStyle == null ? PaymentsTitleBarStyle.A03 : paymentsTitleBarStyle;
        this.paymentsTitleBarTitleStyle = paymentsTitleBarTitleStyle == null ? PaymentsTitleBarTitleStyle.A04 : paymentsTitleBarTitleStyle;
        this.paymentsTitleBarButtonText = str2;
        this.paymentsPayBarButtonText = str;
        this.A00 = (Optional) MoreObjects.firstNonNull(optional, Absent.INSTANCE);
        this.isFullScreenModal = z;
    }

    public static PaymentsDecoratorParams A00() {
        return new PaymentsDecoratorParams(PaymentsDecoratorAnimation.A01, PaymentsTitleBarStyle.A05, PaymentsTitleBarTitleStyle.A03, null, null, null, false);
    }

    public static PaymentsDecoratorParams A01() {
        return new PaymentsDecoratorParams(PaymentsDecoratorAnimation.A03, PaymentsTitleBarStyle.A05, PaymentsTitleBarTitleStyle.A03, null, null, null, false);
    }

    public static PaymentsDecoratorParams A02() {
        return new PaymentsDecoratorParams(PaymentsDecoratorAnimation.A01, null, null, null, null, null, false);
    }

    public static PaymentsDecoratorParams A03() {
        return new PaymentsDecoratorParams(PaymentsDecoratorAnimation.A03, null, null, null, null, null, false);
    }

    public static PaymentsDecoratorParams A04(PaymentsDecoratorParams paymentsDecoratorParams) {
        String str = null;
        PaymentsTitleBarStyle paymentsTitleBarStyle = paymentsDecoratorParams.paymentsTitleBarStyle;
        PaymentsTitleBarTitleStyle paymentsTitleBarTitleStyle = paymentsDecoratorParams.paymentsTitleBarTitleStyle;
        String str2 = paymentsDecoratorParams.paymentsTitleBarButtonText;
        Optional optional = paymentsDecoratorParams.A00;
        boolean z = paymentsDecoratorParams.isFullScreenModal;
        String str3 = paymentsDecoratorParams.paymentsPayBarButtonText;
        if (str3 != null) {
            str = str3;
        }
        return new PaymentsDecoratorParams(PaymentsDecoratorAnimation.A01, paymentsTitleBarStyle, paymentsTitleBarTitleStyle, optional, str, str2, z);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int i2;
        C53v.A0J(parcel, this.paymentsDecoratorAnimation);
        C53v.A0J(parcel, this.paymentsTitleBarStyle);
        C53v.A0J(parcel, this.paymentsTitleBarTitleStyle);
        parcel.writeString(this.paymentsTitleBarButtonText);
        parcel.writeString(this.paymentsPayBarButtonText);
        Optional optional = this.A00;
        if (optional == null) {
            i2 = 0;
        } else {
            i2 = 1;
            if (optional.isPresent()) {
                parcel.writeInt(2);
                C53v.A0K(parcel, (Integer) optional.get());
                parcel.writeInt(this.isFullScreenModal ? 1 : 0);
            }
        }
        parcel.writeInt(i2);
        parcel.writeInt(this.isFullScreenModal ? 1 : 0);
    }
}
