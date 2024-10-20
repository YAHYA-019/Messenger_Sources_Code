package X;

import java.util.Calendar;

/* loaded from: Kl1.class */
public final class Kl1 {
    public 1BY A00;
    public Calendar A01;
    public final C00i A02 = AbH.A0a();
    public final C00i A04 = 1BV.A01((1BY) null, 82109);
    public final C00i A03 = 1BV.A01((1BY) null, 98762);

    public Kl1(1BO r302) {
        this.A00 = 7zL.A0Q(r302);
        Calendar calendar = Calendar.getInstance();
        this.A01 = calendar;
        calendar.add(12, 60 - (calendar.get(12) % 60));
    }
}
