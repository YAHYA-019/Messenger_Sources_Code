package X;

import android.content.res.Resources;
import android.text.SpannableStringBuilder;
import android.text.style.StyleSpan;
import com.facebook.inject.FbInjector;
import com.facebook.payments.confirmation.ConfirmationCommonParams;
import com.facebook.payments.confirmation.ConfirmationCommonParamsCore;
import com.facebook.payments.confirmation.ConfirmationData;
import com.facebook.payments.confirmation.ConfirmationMessageParams;
import com.facebook.payments.confirmation.ConfirmationViewParams;
import com.facebook.payments.confirmation.HeroImageParams;
import com.facebook.payments.confirmation.InviteFriendsActionData;
import com.facebook.payments.confirmation.PostPurchaseAction;
import com.facebook.payments.confirmation.PostPurchaseActionSpec$PostPurchaseActionData;
import com.facebook.payments.confirmation.SimpleConfirmationData;
import com.facebook.payments.confirmation.SubscriptionConfirmationViewParam;
import com.facebook.payments.logging.PaymentsLoggingSessionData;
import com.facebook.payments.model.PaymentItemType;
import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableList;

/* loaded from: Fm6.class */
public final class Fm6 implements GFV {
    public final C00i A00 = FbInjector.A00;
    public final FI2 A01 = DKD.A0X();

    private void A00(PostPurchaseAction postPurchaseAction, ImmutableList.Builder builder, boolean z) {
        PostPurchaseActionSpec$PostPurchaseActionData postPurchaseActionSpec$PostPurchaseActionData = postPurchaseAction.A00;
        Preconditions.checkArgument(AnonymousClass001.A1T(postPurchaseActionSpec$PostPurchaseActionData));
        String str = postPurchaseAction.A02;
        if (str == null) {
            str = 1BL.A0B(this.A00).getString(2131958410);
        }
        builder.m11011add((Object) new RuB(((InviteFriendsActionData) postPurchaseActionSpec$PostPurchaseActionData).A00, str, z));
    }

    private void A01(SimpleConfirmationData simpleConfirmationData, ImmutableList.Builder builder) {
        Resources A0B;
        int i;
        FI2 fi2 = this.A01;
        if (fi2.A04() || simpleConfirmationData.A00.A02.A0A) {
            if (!fi2.A04() || fi2.A08()) {
                A0B = 1BL.A0B(this.A00);
                i = 2131954793;
            } else {
                A0B = 1BL.A0B(this.A00);
                i = 2131959028;
            }
            builder.m11011add((Object) new RuA(A0B.getString(i), simpleConfirmationData.A01.contains(QpY.A01), fi2.A04()));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v25, types: [X.Ru2, java.lang.Object] */
    private void A02(SimpleConfirmationData simpleConfirmationData, ImmutableList.Builder builder) {
        if (this.A01.A06()) {
            ConfirmationCommonParams confirmationCommonParams = simpleConfirmationData.A00;
            if ("BACKLOADED".equals(confirmationCommonParams.A03)) {
                if (simpleConfirmationData.A01.contains(QpY.A02)) {
                    return;
                }
                ConfirmationCommonParamsCore confirmationCommonParamsCore = confirmationCommonParams.A02;
                PaymentsLoggingSessionData paymentsLoggingSessionData = confirmationCommonParamsCore.A05;
                PaymentItemType paymentItemType = confirmationCommonParamsCore.A06;
                ?? obj = new Object();
                ((Ru2) obj).A00 = paymentsLoggingSessionData;
                ((Ru2) obj).A01 = paymentItemType;
                builder.m11011add((Object) obj);
            }
        }
    }

    private void A03(SimpleConfirmationData simpleConfirmationData, ImmutableList.Builder builder, String str) {
        if (str == null) {
            str = 1BL.A0B(this.A00).getString(2131954794);
        }
        ConfirmationCommonParamsCore confirmationCommonParamsCore = simpleConfirmationData.A00.A02;
        builder.m11011add((Object) new RuC(confirmationCommonParamsCore.A06, confirmationCommonParamsCore.A08, str, confirmationCommonParamsCore.A07));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r304v0, types: [java.lang.Object, X.Enr] */
    /* JADX WARN: Type inference failed for: r304v1, types: [java.lang.Object, X.Enr] */
    /* JADX WARN: Type inference failed for: r304v3, types: [java.lang.Object, X.Enr] */
    public void A04(ConfirmationMessageParams confirmationMessageParams, ImmutableList.Builder builder) {
        Enr enr;
        if (confirmationMessageParams == null) {
            ?? obj = new Object();
            obj.A01 = 1BL.A0B(this.A00).getString(2131954799);
            enr = obj;
        } else {
            int intValue = confirmationMessageParams.A02.intValue();
            if (intValue == 0) {
                ?? obj2 = new Object();
                obj2.A02 = confirmationMessageParams.A04;
                enr = obj2;
            } else {
                if (intValue != 1) {
                    throw DKG.A1A("Unsupported ", "DEFAULT");
                }
                C2203Dgv c2203Dgv = confirmationMessageParams.A00;
                ?? obj3 = new Object();
                if (c2203Dgv != null) {
                    obj3.A00 = c2203Dgv;
                } else {
                    String str = confirmationMessageParams.A03;
                    ImmutableList immutableList = confirmationMessageParams.A01;
                    if (immutableList != null) {
                        Preconditions.checkState(AnonymousClass001.A1O(immutableList.size() % 2));
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
                        for (int i = 0; i < immutableList.size(); i += 2) {
                            spannableStringBuilder.setSpan(new StyleSpan(1), DKE.A0G(immutableList, i), DKE.A0G(immutableList, i) + DKE.A0G(immutableList, i + 1), 17);
                        }
                        str = spannableStringBuilder;
                    }
                    obj3.A01 = str;
                }
                obj3.A03 = confirmationMessageParams.A05;
                enr = obj3;
            }
        }
        builder.m11011add((Object) new Fm1(enr));
    }

    public void A05(PostPurchaseAction postPurchaseAction, ImmutableList.Builder builder) {
        String str;
        if (postPurchaseAction != null) {
            int intValue = postPurchaseAction.A01.intValue();
            if (intValue == 0) {
                A00(postPurchaseAction, builder, true);
                return;
            }
            switch (intValue) {
                case 1:
                    str = "SEE_RECEIPT";
                    break;
                case 2:
                    str = "VIEW_PURCHASED_ITEMS";
                    break;
                case 3:
                    str = "SHARE";
                    break;
                default:
                    str = "INVITE_FRIENDS";
                    break;
            }
            throw DKG.A1A("Unsupported primary action", str);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x00c7, code lost:
    
        if (r0.A00 == null) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A06(com.facebook.payments.confirmation.SimpleConfirmationData r302, com.google.common.collect.ImmutableList.Builder r303, com.google.common.collect.ImmutableList r304) {
        /*
            Method dump skipped, instructions count: 298
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Fm6.A06(com.facebook.payments.confirmation.SimpleConfirmationData, com.google.common.collect.ImmutableList$Builder, com.google.common.collect.ImmutableList):void");
    }

    public /* bridge */ /* synthetic */ ImmutableList Adp(ConfirmationData confirmationData) {
        Ru7 ru5;
        String str;
        String str2;
        SimpleConfirmationData simpleConfirmationData = (SimpleConfirmationData) confirmationData;
        ImmutableList.Builder A0h = 4YU.A0h();
        ConfirmationCommonParamsCore confirmationCommonParamsCore = simpleConfirmationData.A00.A02;
        ConfirmationViewParams confirmationViewParams = confirmationCommonParamsCore.A02;
        if (confirmationViewParams != null) {
            HeroImageParams heroImageParams = confirmationViewParams.A02;
            if (heroImageParams != null && (str2 = heroImageParams.A00) != null) {
                A0h.m11011add((Object) new Ru6(str2, heroImageParams.A00()));
            }
            ConfirmationMessageParams confirmationMessageParams = confirmationViewParams.A01;
            A04(confirmationMessageParams, A0h);
            A05(confirmationViewParams.A03, A0h);
            A06(simpleConfirmationData, A0h, confirmationViewParams.A04);
            if (confirmationMessageParams != null && confirmationMessageParams.A02 == 0S2.A01 && (str = confirmationMessageParams.A04) != null) {
                A0h.m11011add((Object) new Ru4(str));
            }
        } else {
            ImmutableList.Builder builder = ImmutableList.builder();
            builder.m11011add((Object) QpY.A08);
            SubscriptionConfirmationViewParam subscriptionConfirmationViewParam = confirmationCommonParamsCore.A03;
            if (subscriptionConfirmationViewParam != null) {
                builder.m11011add((Object) QpY.A0C);
            }
            builder.m11011add((Object) QpY.A0A);
            if (confirmationCommonParamsCore.A0A) {
                builder.m11011add((Object) QpY.A01);
            }
            ImmutableList build = builder.build();
            for (int i = 0; i < build.size(); i++) {
                QpY qpY = (QpY) build.get(i);
                int ordinal = qpY.ordinal();
                if (ordinal != 0) {
                    if (ordinal == 2) {
                        ru5 = new Ru5(1BL.A0B(this.A00).getString(2131954799));
                    } else if (ordinal != 4) {
                        if (ordinal != 5) {
                            throw AnonymousClass001.A0q(AnonymousClass001.A0Z(qpY, "Unsupported ", AnonymousClass001.A0k()));
                        }
                        A03(simpleConfirmationData, A0h, null);
                    } else if (subscriptionConfirmationViewParam != null) {
                        ru5 = new Ru7(subscriptionConfirmationViewParam);
                    }
                    A0h.m11011add((Object) ru5);
                } else if (!this.A01.A04()) {
                    A01(simpleConfirmationData, A0h);
                }
                if (this.A01.A04()) {
                    A01(simpleConfirmationData, A0h);
                }
                A02(simpleConfirmationData, A0h);
            }
        }
        return A0h.build();
    }
}
