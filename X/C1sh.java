package X;

import android.database.sqlite.SQLiteDatabase;

/* renamed from: X.1sh, reason: invalid class name */
/* loaded from: 1sh.class */
public final class C1sh implements 1DX {
    public 1DX A00;
    public C00m A01;
    public final C00m A02;

    public C1sh(1DX r302, C00m c00m, C00m c00m2) {
        this.A02 = c00m2;
        this.A00 = r302;
        this.A01 = c00m;
    }

    public void AFH() {
        this.A00.AFH();
    }

    public void AGH() {
        this.A00.AGH();
    }

    public void AMe() {
        this.A00.AMe();
    }

    /* renamed from: AUF, reason: merged with bridge method [inline-methods] */
    public SQLiteDatabase get() {
        synchronized (this) {
            if (((Boolean) this.A01.invoke()).booleanValue()) {
                this.A00.AGH();
                1DX r0 = (1DX) this.A02.invoke();
                if (r0 instanceof C1sh) {
                    C1sh c1sh = (C1sh) r0;
                    this.A00 = c1sh.A00;
                    this.A01 = c1sh.A01;
                } else {
                    this.A00 = r0;
                }
            }
        }
        SQLiteDatabase AUF = this.A00.AUF();
        11T.A0A(AUF);
        return AUF;
    }

    public long Afu() {
        return this.A00.Afu();
    }
}
