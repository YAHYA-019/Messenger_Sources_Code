package X;

import com.google.common.collect.ImmutableMap;

/* renamed from: X.4vf, reason: invalid class name and case insensitive filesystem */
/* loaded from: 4vf.class */
public final class C11064vf implements 2LK {
    public final C0dr A02 = (C0dr) 1Bi.A03(84488);
    public final 1Up A01 = new 1Up(20);
    public final 1Up A00 = new 1Up(20);

    public void A00(int i, boolean z) {
        this.A01.A04(new 7gE(this.A02.now(), i, z));
    }

    public void A01(String str, String str2) {
        if (str.startsWith("com.facebook.orca.chatheads.")) {
            str = str.substring("com.facebook.orca.chatheads.".length());
        }
        this.A00.A04(new C11074vg(this.A02.now(), str, str2));
    }

    public java.util.Map Agf() {
        String obj;
        String obj2;
        1Up r0 = this.A01;
        if (r0.A05()) {
            obj = "none";
        } else {
            long now = this.A02.now();
            StringBuilder A0l = AnonymousClass001.A0l(r0.A00() * 100);
            for (7gE r02 : 1JW.A05(r0.A03())) {
                A0l.append('{');
                A0l.append((now - r02.A00) / 1000.0d);
                A0l.append(" s ago: ");
                int i = r02.A00;
                A0l.append(i != 5 ? i != 10 ? i != 15 ? i != 20 ? i != 25 ? i != 40 ? i != 60 ? i != 80 ? String.valueOf(i) : "TRIM_MEMORY_COMPLETE" : "TRIM_MEMORY_MODERATE" : "TRIM_MEMORY_BACKGROUND" : "ON_LOW_MEMORY_CALLBACK" : "TRIM_MEMORY_UI_HIDDEN" : "TRIM_MEMORY_RUNNING_CRITICAL" : "TRIM_MEMORY_RUNNING_LOW" : "TRIM_MEMORY_RUNNING_MODERATE");
                A0l.append(", hwResDestroyed=");
                A0l.append(r02.A01);
                A0l.append("}, ");
            }
            A0l.delete(A0l.length() - 2, A0l.length());
            obj = A0l.toString();
        }
        1Up r03 = this.A00;
        if (r03.A05()) {
            obj2 = "none";
        } else {
            long now2 = this.A02.now();
            StringBuilder A0l2 = AnonymousClass001.A0l(r03.A00() * 100);
            for (C11074vg c11074vg : 1JW.A05(r03.A03())) {
                A0l2.append('{');
                A0l2.append((now2 - ((AbstractC11084vh) c11074vg).A00) / 1000.0d);
                A0l2.append("s ago: ");
                A0l2.append(c11074vg.A00);
                String str = c11074vg.A01;
                if (str != null) {
                    A0l2.append("/");
                    A0l2.append(str);
                }
                A0l2.append("}, ");
            }
            A0l2.delete(A0l2.length() - 2, A0l2.length());
            obj2 = A0l2.toString();
        }
        return ImmutableMap.of((Object) "chat_head_memory_trims", (Object) obj, (Object) "chat_head_command_history", (Object) obj2);
    }
}
