package com.facebook.rtc.logging.api;

import X.04S;
import X.0DO;
import X.0DR;
import X.0Dt;
import X.0G8;
import X.11T;
import X.4zI;
import X.AnonymousClass001;
import X.C0di;
import X.C4zR;
import java.util.Date;
import kotlin.jvm.functions.Function2;

/* loaded from: RtcAppLog$log$1.class */
public final class RtcAppLog$log$1 extends 0DO implements Function2 {
    public final /* synthetic */ Date $date;
    public final /* synthetic */ String $level;
    public final /* synthetic */ String $msg;
    public final /* synthetic */ Throwable $t;
    public final /* synthetic */ String $tag;
    public int label;
    public final /* synthetic */ 4zI this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RtcAppLog$log$1(4zI r302, String str, String str2, String str3, Throwable th, Date date, 0DR r308) {
        super(2, r308);
        this.this$0 = r302;
        this.$level = str;
        this.$t = th;
        this.$tag = str2;
        this.$msg = str3;
        this.$date = date;
    }

    public final 0DR create(Object obj, 0DR r303) {
        return new RtcAppLog$log$1(this.this$0, this.$level, this.$tag, this.$msg, this.$t, this.$date, r303);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return create(obj, (0DR) obj2).invokeSuspend(04S.A00);
    }

    public final Object invokeSuspend(Object obj) {
        String format;
        if (this.label != 0) {
            throw AnonymousClass001.A0M();
        }
        0Dt.A00(obj);
        C4zR c4zR = (C4zR) this.this$0.A00.A00.get();
        String str = this.$level;
        Throwable th = this.$t;
        String str2 = this.$tag;
        String str3 = this.$msg;
        Date date = this.$date;
        11T.A0F(str2, 2);
        11T.A0F(str3, 3);
        11T.A0F(date, 4);
        StringBuilder sb = new StringBuilder();
        synchronized (c4zR.A04) {
            format = c4zR.A06.format(date);
            11T.A0A(format);
        }
        sb.append(format);
        sb.append("> ");
        if (str != null && str.length() != 0) {
            String A04 = C0di.A00().A04();
            if (A04 == null || A04.length() == 0) {
                A04 = "main";
            }
            sb.append(str);
            sb.append(" [");
            sb.append(A04);
            sb.append("] ");
        }
        sb.append(str2);
        sb.append(": ");
        sb.append(str3);
        if (th != null) {
            sb.append('\n');
            sb.append(0G8.A01(th));
        }
        String obj2 = sb.toString();
        11T.A0A(obj2);
        C4zR.A01(c4zR, obj2);
        return 04S.A00;
    }
}
