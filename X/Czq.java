package X;

import android.content.Context;
import android.content.res.Resources;
import android.view.ViewStub;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.google.common.base.Preconditions;

/* loaded from: Czq.class */
public final class Czq implements GFd {
    public final Context A00 = 7zP.A0J();

    /* JADX WARN: Type inference failed for: r0v75, types: [X.2Wo, java.lang.Object] */
    @Override // X.GFd
    public GFc B1x(ThreadSummary threadSummary, EMw eMw) {
        Context context;
        CharSequence string;
        CharSequence charSequence;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int ordinal = eMw.ordinal();
        if (ordinal == 1) {
            context = this.A00;
            string = context.getResources().getString(2131953696);
            charSequence = null;
            i = 2131953694;
            i2 = 2132345097;
            i3 = 2131953693;
            i4 = 2132345093;
            i5 = 2131953695;
        } else {
            if (ordinal != 2) {
                if (ordinal != 0) {
                    throw AnonymousClass002.A0C(eMw, "Invalid PaymentAwarenessMode provided: ", AnonymousClass001.A0k());
                }
                context = this.A00;
                string = context.getResources().getString(2131962786);
                charSequence = context.getResources().getString(2131962785);
                i = 2131962784;
                i2 = 2132345064;
                i3 = 2131962782;
                i4 = 2132345562;
                i5 = 2131962783;
                i6 = 2132345093;
                i7 = 2131962780;
                i8 = 2132542984;
                QVs qVs = new QVs(context);
                Preconditions.checkArgument(!1JF.A0B(string));
                qVs.A06.setText(string);
                qVs.A04.setText(charSequence);
                2OB r0 = qVs.A02;
                r0.setText(i);
                r0.setCompoundDrawablesWithIntrinsicBounds(i2, 0, 0, 0);
                Context context2 = qVs.getContext();
                int color = context2.getColor(2132214024);
                Resources resources = qVs.getResources();
                C1uu.A00(resources, r0.getCompoundDrawables()[0], color);
                2OB r02 = qVs.A03;
                r02.setText(i3);
                r02.setCompoundDrawablesWithIntrinsicBounds(i4, 0, 0, 0);
                C1uu.A00(resources, r02.getCompoundDrawables()[0], context2.getColor(2132214024));
                2OB r03 = qVs.A05;
                r03.setText(i5);
                r03.setCompoundDrawablesWithIntrinsicBounds(i6, 0, 0, 0);
                C1uu.A00(resources, r03.getCompoundDrawables()[0], context2.getColor(2132214024));
                qVs.A01.setText(i7);
                ViewStub viewStub = qVs.A00;
                viewStub.getClass();
                viewStub.setLayoutResource(i8);
                ?? obj = new Object();
                ((2Wo) obj).A01 = viewStub;
                obj.A03();
                return (GFc) qVs;
            }
            context = this.A00;
            string = context.getResources().getString(2131953700);
            charSequence = null;
            i = 2131953698;
            i2 = 2132345097;
            i3 = 2131953697;
            i4 = 2132345093;
            i5 = 2131953699;
        }
        i6 = 2132345562;
        i7 = 2131962432;
        i8 = 2132543022;
        QVs qVs2 = new QVs(context);
        Preconditions.checkArgument(!1JF.A0B(string));
        qVs2.A06.setText(string);
        qVs2.A04.setText(charSequence);
        2OB r04 = qVs2.A02;
        r04.setText(i);
        r04.setCompoundDrawablesWithIntrinsicBounds(i2, 0, 0, 0);
        Context context22 = qVs2.getContext();
        int color2 = context22.getColor(2132214024);
        Resources resources2 = qVs2.getResources();
        C1uu.A00(resources2, r04.getCompoundDrawables()[0], color2);
        2OB r022 = qVs2.A03;
        r022.setText(i3);
        r022.setCompoundDrawablesWithIntrinsicBounds(i4, 0, 0, 0);
        C1uu.A00(resources2, r022.getCompoundDrawables()[0], context22.getColor(2132214024));
        2OB r032 = qVs2.A05;
        r032.setText(i5);
        r032.setCompoundDrawablesWithIntrinsicBounds(i6, 0, 0, 0);
        C1uu.A00(resources2, r032.getCompoundDrawables()[0], context22.getColor(2132214024));
        qVs2.A01.setText(i7);
        ViewStub viewStub2 = qVs2.A00;
        viewStub2.getClass();
        viewStub2.setLayoutResource(i8);
        ?? obj2 = new Object();
        ((2Wo) obj2).A01 = viewStub2;
        obj2.A03();
        return (GFc) qVs2;
    }
}
