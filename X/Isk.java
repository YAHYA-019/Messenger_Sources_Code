package X;

/* loaded from: Isk.class */
public final class Isk implements Runnable {
    public static final String __redex_internal_original_name = "AvRecordingTrackMuxer$1";
    public final /* synthetic */ ICM A00;

    public Isk(ICM icm) {
        this.A00 = icm;
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:?, code lost:
    
        throw r0.A09.post(new X.SDO((X.Gu0) r0, r0, r0));
     */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Throwable, java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v21, types: [X.HDP, X.Gu0] */
    /* JADX WARN: Type inference failed for: r0v42, types: [java.lang.Throwable, boolean] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void run() {
        /*
            r301 = this;
            java.lang.String r0 = "checkIfAnySamplesReceived"
            r302 = r0
            r0 = r302
            X.HvA.A01(r0)
            r0 = r301
            X.ICM r0 = r0.A00     // Catch: java.lang.Throwable -> Lb1
            r303 = r0
            r0 = r303
            X.Hbt r0 = r0.A03     // Catch: java.lang.Throwable -> Lb1
            r304 = r0
            r0 = r303
            boolean r0 = r0.A0H     // Catch: java.lang.Throwable -> Lb1
            r305 = r0
            r0 = r305
            if (r0 == 0) goto Lb0
            r0 = r303
            java.util.concurrent.atomic.AtomicBoolean r0 = r0.A06     // Catch: java.lang.Throwable -> Lb1
            r302 = r0
            r0 = 0
            r306 = r0
            r0 = 1
            r307 = r0
            r0 = r302
            r1 = 0
            r2 = r307
            boolean r0 = r0.compareAndSet(r1, r2)     // Catch: java.lang.Throwable -> Lb1
            r305 = r0
            r0 = r305
            if (r0 == 0) goto Lb0
            r0 = r303
            r1 = 0
            r0.A0H = r1     // Catch: java.lang.Throwable -> Lb1
            r0 = r304
            if (r0 == 0) goto Lb0
            r0 = 0
            r308 = r0
            java.lang.String r0 = "Timeout while waiting for first samples for muxing"
            r306 = r0
            r0 = 21003(0x520b, float:2.9431E-41)
            r305 = r0
            X.Gu0 r0 = new X.Gu0     // Catch: java.lang.Throwable -> Lb1
            r309 = r0
            r0 = r309
            r1 = r306
            r2 = 0
            r3 = r305
            r0.<init>(r1, r2, r3)     // Catch: java.lang.Throwable -> Lb1
            java.lang.String r0 = "v"
            r310 = r0
            r0 = r303
            boolean r0 = r0.A0G     // Catch: java.lang.Throwable -> Lb1
            r308 = r0
            java.lang.String r0 = "_a"
            r306 = r0
            r0 = r303
            boolean r0 = r0.A0F     // Catch: java.lang.Throwable -> Lb1
            r305 = r0
            r0 = r310
            r1 = r306
            r2 = r308
            r3 = r305
            java.lang.String r0 = X.0Pz.A1A(r0, r1, r2, r3)     // Catch: java.lang.Throwable -> Lb1
            r306 = r0
            java.lang.String r0 = "muxer_first_samples_written"
            r302 = r0
            r0 = r309
            r1 = r302
            r2 = r306
            r0.A03(r1, r2)     // Catch: java.lang.Throwable -> Lb1
            r0 = r307
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch: java.lang.Throwable -> Lb1
            r306 = r0
            java.lang.String r0 = "muxer_has_started"
            r302 = r0
            r0 = r309
            r1 = r302
            r2 = r306
            r0.A03(r1, r2)     // Catch: java.lang.Throwable -> Lb1
            r0 = r303
            android.os.Handler r0 = r0.A09     // Catch: java.lang.Throwable -> Lb1
            r306 = r0
            X.SDO r0 = new X.SDO     // Catch: java.lang.Throwable -> Lb1
            r302 = r0
            r0 = r302
            r1 = r309
            r2 = r304
            r3 = r303
            r0.<init>(r1, r2, r3)     // Catch: java.lang.Throwable -> Lb1
            r0 = r306
            r1 = r302
            boolean r0 = r0.post(r1)     // Catch: java.lang.Throwable -> Lb1
        Lb0:
            return
        Lb1:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Isk.run():void");
    }
}
