package com.facebook.payments.p2p.model;

import X.1BL;
import X.2JX;
import X.2JZ;
import X.2tS;
import X.6As;
import X.AbE;
import X.AbF;
import X.AbM;
import X.C2231Dhn;
import X.C41w;
import X.C53v;
import X.Dkx;
import X.ENJ;
import X.EnumC3492Mfn;
import X.FJ8;
import X.FKZ;
import X.RZV;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.acra.asyncbroadcastreceiver.AsyncBroadcastReceiverObserver;
import com.facebook.graphql.enums.GraphQLStringDefUtil;
import com.facebook.graphservice.interfaces.Tree;
import com.facebook.graphservice.tree.TreeBuilderJNI;
import com.facebook.wearable.common.comms.hera.shared.engine.consts.ConstantsKt;
import com.google.common.base.MoreObjects;

/* loaded from: PaymentTransaction.class */
public final class PaymentTransaction implements Parcelable, C41w {
    public static final 2JX A0F;
    public static final Parcelable.Creator CREATOR;
    public 2JX A00;
    public Amount A01;
    public Amount A02;
    public CommerceOrder A03;
    public ENJ A04;
    public Receiver A05;
    public Sender A06;
    public EnumC3492Mfn A07;
    public C2231Dhn A08;
    public String A09;
    public String A0A;
    public String A0B;
    public String A0C;
    public boolean A0D;
    public final String A0E;

    static {
        Object obj = 2JZ.A01;
        A0F = AbF.A0N(2tS.A00(), 6As.class, "PeerToPeerTransferContext", 299761361).getResult(2JX.class, 299761361);
        CREATOR = FKZ.A00(94);
    }

    public PaymentTransaction() {
        this.A0E = null;
        this.A04 = null;
        this.A05 = null;
        this.A06 = null;
        this.A0A = null;
        this.A07 = null;
        this.A09 = null;
        this.A0C = null;
        this.A01 = null;
        this.A02 = null;
        this.A00 = null;
        this.A08 = null;
        this.A03 = null;
        this.A0B = null;
        this.A0D = false;
    }

    public PaymentTransaction(2JX r302, Amount amount, Amount amount2, CommerceOrder commerceOrder, ENJ enj, Receiver receiver, Sender sender, EnumC3492Mfn enumC3492Mfn, C2231Dhn c2231Dhn, String str, String str2, String str3, String str4, String str5, boolean z) {
        this.A0E = str3;
        this.A04 = enj;
        this.A0A = str2;
        this.A07 = enumC3492Mfn;
        this.A0C = str5;
        this.A09 = str;
        this.A06 = sender;
        this.A05 = receiver;
        this.A01 = amount;
        this.A02 = amount2;
        this.A00 = r302;
        this.A08 = c2231Dhn;
        this.A03 = commerceOrder;
        this.A0B = str4;
        this.A0D = z;
        A01();
    }

    public PaymentTransaction(RZV rzv) {
        this.A0E = rzv.A0B;
        this.A04 = rzv.A04;
        this.A0A = rzv.A0A;
        this.A07 = rzv.A07;
        this.A0C = rzv.A0D;
        this.A09 = rzv.A09;
        this.A06 = rzv.A06;
        this.A05 = rzv.A05;
        this.A01 = rzv.A01;
        this.A02 = rzv.A02;
        this.A00 = rzv.A00;
        this.A08 = rzv.A08;
        this.A03 = rzv.A03;
        this.A0B = rzv.A0C;
        this.A0D = rzv.A0E;
        A01();
    }

    public PaymentTransaction(Parcel parcel) {
        this.A0E = parcel.readString();
        this.A04 = C53v.A07(parcel, ENJ.class);
        this.A0A = parcel.readString();
        this.A07 = (EnumC3492Mfn) parcel.readSerializable();
        this.A0C = parcel.readString();
        this.A09 = parcel.readString();
        this.A06 = (Sender) 1BL.A0C(parcel, Sender.class);
        this.A05 = (Receiver) 1BL.A0C(parcel, Receiver.class);
        this.A01 = (Amount) 1BL.A0C(parcel, Amount.class);
        this.A02 = (Amount) 1BL.A0C(parcel, Amount.class);
        this.A00 = FJ8.A01(parcel);
        this.A08 = (C2231Dhn) FJ8.A01(parcel);
        this.A03 = (CommerceOrder) 1BL.A0C(parcel, CommerceOrder.class);
        this.A0B = parcel.readString();
        this.A0D = C53v.A0S(parcel);
        A01();
    }

    public static Tree A00(Amount amount) {
        Tree tree = null;
        if (amount != null) {
            6As A00 = Dkx.A00();
            A00.A08("amount_with_offset", amount.mAmountWithOffset);
            A00.setString("currency", amount.mCurrency);
            A00.A08("offset", amount.mOffset);
            tree = A00.getResult(Dkx.class, 57213880);
        }
        return tree;
    }

    private void A01() {
        AbM.A1T(this.A0E);
        ENJ enj = this.A04;
        if (enj == null) {
            enj = ENJ.A0D;
        }
        this.A04 = enj;
        String str = this.A0A;
        String str2 = ConstantsKt.CAMERA_ID_FRONT;
        if (str == null) {
            str = str2;
        }
        this.A0A = str;
        String str3 = this.A09;
        if (str3 == null) {
            str3 = str2;
        }
        this.A09 = str3;
        String str4 = this.A0C;
        if (str4 != null) {
            str2 = str4;
        }
        this.A0C = str2;
        Sender sender = this.A06;
        if (sender == null) {
            sender = Sender.A00;
        }
        this.A06 = sender;
        Receiver receiver = this.A05;
        if (receiver == null) {
            receiver = Receiver.A00;
        }
        this.A05 = receiver;
        EnumC3492Mfn enumC3492Mfn = this.A07;
        if (enumC3492Mfn == null) {
            enumC3492Mfn = EnumC3492Mfn.A0Y;
        }
        this.A07 = enumC3492Mfn;
        Amount amount = this.A01;
        if (amount == null) {
            amount = Amount.A00;
        }
        this.A01 = amount;
        Amount amount2 = this.A02;
        if (amount2 == null) {
            amount2 = Amount.A01;
        }
        this.A02 = amount2;
        2JX r302 = this.A00;
        if (r302 == null) {
            r302 = A0F;
        }
        this.A00 = r302;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v34, types: [com.facebook.graphservice.tree.TreeBuilderJNI, X.6As] */
    /* JADX WARN: Type inference failed for: r2v16, types: [com.facebook.graphservice.interfaces.Tree] */
    public 2JX A02() {
        Tree result;
        Tree result2;
        Tree tree = null;
        if (this.A04 == ENJ.A0D) {
            return null;
        }
        C2231Dhn c2231Dhn = this.A08;
        if (c2231Dhn == null) {
            c2231Dhn = null;
        }
        String ATw = GraphQLStringDefUtil.A00().ATw("GraphQLPeerToPeerTransferReceiverStatus", this.A07.toString());
        String ATw2 = GraphQLStringDefUtil.A00().ATw("GraphQLPeerToPeerTransferSenderStatus", this.A07.toString());
        Tree tree2 = this.A00;
        if (!2JX.A0A(299761361, tree2)) {
            tree2 = null;
        }
        ?? r0 = (6As) 2tS.A00().newTreeBuilder(this.A04.mValue, 6As.class, 1899957318);
        r0.setTree("amount", A00(this.A01));
        r0.setTree("amount_fb_discount", A00(this.A02));
        CommerceOrder commerceOrder = this.A03;
        if (commerceOrder == null) {
            result = null;
        } else {
            TreeBuilderJNI A0N = AbF.A0N(2tS.A00(), 6As.class, AbE.A00(239), -2054921640);
            A0N.setString("description", commerceOrder.mDescription);
            A0N.setString(PublicKeyCredentialControllerUtility.JSON_KEY_ID, commerceOrder.mId);
            A0N.setString("image_url", commerceOrder.mImageUrl);
            A0N.setString(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, commerceOrder.mName);
            A0N.setString("seller_info", commerceOrder.mSellerInfo);
            result = A0N.getResult(2JX.class, -2054921640);
        }
        r0.setTree("commerce_order", result);
        r0.A09("completed_time", Long.parseLong(this.A09));
        r0.A09("creation_time", Long.parseLong(this.A0A));
        r0.setString(PublicKeyCredentialControllerUtility.JSON_KEY_ID, this.A0E);
        r0.setTree("platform_item", c2231Dhn);
        Receiver receiver = this.A05;
        if (receiver == null) {
            result2 = null;
        } else {
            6As A01 = 2JX.A01();
            A01.setString(PublicKeyCredentialControllerUtility.JSON_KEY_ID, receiver.mId);
            A01.A0B("is_messenger_user", receiver.mIsMessengerUser);
            A01.setString(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, receiver.mName);
            result2 = A01.getResult(2JX.class, 684260477);
        }
        r0.setTree("receiver_profile", result2);
        r0.A0A(ATw, "receiver_status");
        Sender sender = this.A06;
        if (sender != null) {
            6As A012 = 2JX.A01();
            A012.setString(PublicKeyCredentialControllerUtility.JSON_KEY_ID, sender.mId);
            A012.A0B("is_messenger_user", sender.mIsMessengerUser);
            A012.setString(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, sender.mName);
            tree = A012.getResult(2JX.class, 684260477);
        }
        r0.setTree("sender", tree);
        r0.A0A(ATw2, "sender_status");
        r0.setTree("transfer_context", tree2);
        r0.A09("updated_time", Long.parseLong(this.A0C));
        r0.setString("order_id", this.A0B);
        return r0.getResult(2JX.class, 1899957318);
    }

    @Override // X.C41w
    public /* bridge */ /* synthetic */ Object CY7() {
        A01();
        return this;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        MoreObjects.ToStringHelper stringHelper = MoreObjects.toStringHelper(this);
        stringHelper.add(PublicKeyCredentialControllerUtility.JSON_KEY_ID, this.A0E);
        stringHelper.add("payment_type", this.A04);
        stringHelper.add("sender", this.A06);
        stringHelper.add(AsyncBroadcastReceiverObserver.RECEIVER, this.A05);
        stringHelper.add("creation_time", this.A0A);
        stringHelper.add("transfer_status", this.A07);
        stringHelper.add("completed_time", this.A09);
        stringHelper.add("updated_time", this.A0C);
        stringHelper.add("amount", this.A01);
        stringHelper.add("amount_fb_discount", this.A02);
        stringHelper.add("transfer_context", this.A00);
        stringHelper.add("platform_item", this.A08);
        stringHelper.add("commerce_order", this.A03);
        stringHelper.add("order_id", this.A0B);
        stringHelper.add("native_receipt_enabled", this.A0D);
        return stringHelper.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A0E);
        C53v.A0J(parcel, this.A04);
        parcel.writeString(this.A0A);
        parcel.writeSerializable(this.A07);
        parcel.writeString(this.A0C);
        parcel.writeString(this.A09);
        parcel.writeParcelable(this.A06, i);
        parcel.writeParcelable(this.A05, i);
        parcel.writeParcelable(this.A01, i);
        parcel.writeParcelable(this.A02, i);
        FJ8.A0A(parcel, this.A00);
        FJ8.A0A(parcel, this.A08);
        parcel.writeParcelable(this.A03, i);
        parcel.writeString(this.A0B);
        parcel.writeInt(this.A0D ? 1 : 0);
    }
}
