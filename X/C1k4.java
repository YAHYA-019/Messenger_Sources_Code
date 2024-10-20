package X;

import com.facebook.msys.mci.Database;

/* renamed from: X.1k4, reason: invalid class name */
/* loaded from: 1k4.class */
public final class C1k4 implements 1gO {
    public final /* synthetic */ 1gO A00;
    public final /* synthetic */ 1aY A01;

    public C1k4(1gO r302, 1aY r303) {
        this.A00 = r302;
        this.A01 = r303;
    }

    public Database.SchemaDeployer AqI() {
        return new 3bC(this, 3);
    }

    public Database.SchemaDeployer AqJ() {
        return new 3bC(this, 1);
    }

    public Database.SchemaDeployer AqK() {
        return new 3bC(this, 2);
    }

    public Database.SchemaDeployer AzL() {
        return this.A00.AzL();
    }

    public Database.SchemaDeployer B2Y() {
        return this.A00.B2Y();
    }

    public Database.VirtualTableModuleRegistrator BKM() {
        return this.A00.BKM();
    }
}
