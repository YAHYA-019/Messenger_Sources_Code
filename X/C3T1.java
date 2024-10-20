package X;

import android.content.Context;
import com.facebook.inject.FbInjector;
import com.facebook.messaging.rtc.meetups.speakeasy.model.SpeakeasyTopicModel;
import com.facebook.user.model.Name;
import com.facebook.user.model.User;
import com.google.common.collect.ImmutableList;

/* renamed from: X.3T1, reason: invalid class name */
/* loaded from: 3T1.class */
public final class C3T1 {
    public final 1Br A00 = 1Bq.A00(67196);
    public final ImmutableList A01;

    public C3T1() {
        ImmutableList.Builder builder = ImmutableList.builder();
        builder.m11011add((Object) A02());
        RTC rtc = new RTC();
        rtc.A01(((1Ih) 1Br.A0B(this.A00)).getString(2131966158));
        rtc.A00("��");
        rtc.A00 = 0;
        builder.m11011add((Object) new SpeakeasyTopicModel(rtc));
        RTC rtc2 = new RTC();
        rtc2.A01(((1Ih) 1Br.A0B(this.A00)).getString(2131966159));
        rtc2.A00("⚡️");
        rtc2.A00 = 0;
        builder.m11011add((Object) new SpeakeasyTopicModel(rtc2));
        RTC rtc3 = new RTC();
        rtc3.A01(((1Ih) 1Br.A0B(this.A00)).getString(2131966155));
        rtc3.A00("��");
        rtc3.A00 = 0;
        builder.m11011add((Object) new SpeakeasyTopicModel(rtc3));
        RTC rtc4 = new RTC();
        rtc4.A01(((1Ih) 1Br.A0B(this.A00)).getString(2131966157));
        rtc4.A00("��");
        rtc4.A00 = 0;
        builder.m11011add((Object) new SpeakeasyTopicModel(rtc4));
        RTC rtc5 = new RTC();
        rtc5.A01(((1Ih) 1Br.A0B(this.A00)).getString(2131966156));
        rtc5.A00("��");
        rtc5.A00 = 0;
        builder.m11011add((Object) new SpeakeasyTopicModel(rtc5));
        RTC rtc6 = new RTC();
        rtc6.A01(((1Ih) 1Br.A0B(this.A00)).getString(2131966151));
        rtc6.A00("��");
        rtc6.A00 = 0;
        builder.m11011add((Object) new SpeakeasyTopicModel(rtc6));
        RTC rtc7 = new RTC();
        rtc7.A01(((1Ih) 1Br.A0B(this.A00)).getString(2131966167));
        rtc7.A00("��");
        rtc7.A00 = 0;
        builder.m11011add((Object) new SpeakeasyTopicModel(rtc7));
        RTC rtc8 = new RTC();
        rtc8.A01(((1Ih) 1Br.A0B(this.A00)).getString(2131966149));
        rtc8.A00("☕️");
        rtc8.A00 = 0;
        builder.m11011add((Object) new SpeakeasyTopicModel(rtc8));
        RTC rtc9 = new RTC();
        rtc9.A01(((1Ih) 1Br.A0B(this.A00)).getString(2131966165));
        rtc9.A00("��");
        rtc9.A00 = 0;
        builder.m11011add((Object) new SpeakeasyTopicModel(rtc9));
        RTC rtc10 = new RTC();
        rtc10.A01(((1Ih) 1Br.A0B(this.A00)).getString(2131966161));
        rtc10.A00("��");
        rtc10.A00 = 0;
        builder.m11011add((Object) new SpeakeasyTopicModel(rtc10));
        RTC rtc11 = new RTC();
        rtc11.A01(((1Ih) 1Br.A0B(this.A00)).getString(2131966153));
        rtc11.A00("��");
        rtc11.A00 = 0;
        builder.m11011add((Object) new SpeakeasyTopicModel(rtc11));
        RTC rtc12 = new RTC();
        rtc12.A01(((1Ih) 1Br.A0B(this.A00)).getString(2131966164));
        rtc12.A00("��");
        rtc12.A00 = 0;
        builder.m11011add((Object) new SpeakeasyTopicModel(rtc12));
        RTC rtc13 = new RTC();
        rtc13.A01(((1Ih) 1Br.A0B(this.A00)).getString(2131966166));
        rtc13.A00("��");
        rtc13.A00 = 0;
        builder.m11011add((Object) new SpeakeasyTopicModel(rtc13));
        RTC rtc14 = new RTC();
        rtc14.A01(((1Ih) 1Br.A0B(this.A00)).getString(2131966154));
        rtc14.A00("��");
        rtc14.A00 = 0;
        builder.m11011add((Object) new SpeakeasyTopicModel(rtc14));
        RTC rtc15 = new RTC();
        rtc15.A01(((1Ih) 1Br.A0B(this.A00)).getString(2131966163));
        rtc15.A00("��");
        rtc15.A00 = 0;
        builder.m11011add((Object) new SpeakeasyTopicModel(rtc15));
        RTC rtc16 = new RTC();
        rtc16.A01(((1Ih) 1Br.A0B(this.A00)).getString(2131966152));
        rtc16.A00("��");
        rtc16.A00 = 0;
        builder.m11011add((Object) new SpeakeasyTopicModel(rtc16));
        RTC rtc17 = new RTC();
        rtc17.A01(((1Ih) 1Br.A0B(this.A00)).getString(2131966150));
        rtc17.A00("��");
        rtc17.A00 = 0;
        builder.m11011add((Object) new SpeakeasyTopicModel(rtc17));
        RTC rtc18 = new RTC();
        rtc18.A01(((1Ih) 1Br.A0B(this.A00)).getString(2131966162));
        rtc18.A00("☀️");
        rtc18.A00 = 0;
        builder.m11011add((Object) new SpeakeasyTopicModel(rtc18));
        RTC rtc19 = new RTC();
        rtc19.A01(((1Ih) 1Br.A0B(this.A00)).getString(2131966160));
        rtc19.A00("��");
        rtc19.A00 = 0;
        builder.m11011add((Object) new SpeakeasyTopicModel(rtc19));
        this.A01 = 1Fj.A01(builder);
    }

    public static final String A00() {
        Context A00 = FbInjector.A00();
        11T.A0D(A00);
        Name name = ((User) 1Bn.A0A(83430)).A0X;
        String str = name.firstName;
        if (str == null || str.length() == 0) {
            str = name.A00();
            if (str == null) {
                str = "";
            }
        }
        11T.A0H(A00, str);
        String string = A00.getResources().getString(2131966169, str);
        if (string == null) {
            string = "";
        }
        return string;
    }

    public static final String A01(C3T1 c3t1) {
        1Ih r0 = (1Ih) 1Br.A0B(c3t1.A00);
        Name name = ((User) 1Bn.A0A(83430)).A0X;
        String str = name.firstName;
        if (str == null || str.length() == 0) {
            str = name.A00();
            if (str == null) {
                str = "";
            }
        }
        String string = r0.getString(2131966140, str);
        11T.A0A(string);
        return string;
    }

    public final SpeakeasyTopicModel A02() {
        RTC rtc = new RTC();
        rtc.A01(A00());
        rtc.A00("��");
        rtc.A03 = true;
        rtc.A00 = 0;
        return new SpeakeasyTopicModel(rtc);
    }
}
