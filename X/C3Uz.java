package X;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.OverlappingFileLockException;

/* renamed from: X.3Uz, reason: invalid class name */
/* loaded from: 3Uz.class */
public final class C3Uz implements 1KT {
    public final 3Mn A00;

    public C3Uz(3Mn r302) {
        this.A00 = r302;
    }

    public void Bwk() {
        long nextInt;
        DataInputStream dataInputStream;
        int readInt;
        long j;
        long j2;
        long j3;
        DataOutputStream dataOutputStream;
        3Mn r0 = this.A00;
        int i = r0.A02;
        if (i > 0) {
            int i2 = r0.A00;
            int i3 = (-1) >>> 1;
            int i4 = i2 == i3 ? (i3 % i) + 1 : i2 + 1;
            r0.A00 = i4;
            if (i4 % i == 0) {
                1RX r02 = r0.A04;
                Integer num = 0S2.A00;
                1Rf A06 = r02.A06(num, "pigeon_beacon", false);
                A06.A08("pigeon_reserved_keyword_module", "marauder");
                IOException iOException = r0.A01;
                if (iOException == null) {
                    File A00 = 0eB.A00(r0.A03, 1262619000);
                    A00.mkdirs();
                    iOException = new RMG(AnonymousClass001.A0D(A00, "micro_batch"));
                    r0.A01 = iOException;
                }
                try {
                    synchronized (iOException) {
                        try {
                            File file = iOException.A02;
                            if (!file.exists() && !iOException.A01.exists()) {
                                File file2 = iOException.A00;
                                if (!file2.exists() && !file2.mkdirs()) {
                                    th = AnonymousClass001.A0G(AnonymousClass001.A0Z(file2, "Cannot create ", AnonymousClass001.A0k()));
                                    throw iOException;
                                }
                            }
                            0CI r03 = new 0CI(file);
                            try {
                                File file3 = iOException.A01;
                                try {
                                    if (file3.exists()) {
                                        try {
                                            dataInputStream = new DataInputStream(new BufferedInputStream(new FileInputStream(file3), 16));
                                            try {
                                                readInt = dataInputStream.readInt();
                                            } catch (Throwable th) {
                                                dataInputStream.close();
                                                throw th;
                                            }
                                        } catch (IOException e) {
                                            0fH.A11("BeaconIdGenerator", "Failure reading beacon id file %s", e, new Object[]{file3});
                                        }
                                        if (readInt != 1) {
                                            throw AnonymousClass001.A0G(0Pz.A0T("expected 1; got ", readInt));
                                        }
                                        long readLong = dataInputStream.readLong();
                                        dataInputStream.close();
                                        if (readLong != 0) {
                                            int i5 = (int) (readLong >> 32);
                                            int i6 = (int) (readLong & 4294967295L);
                                            if (i5 == ((-1) >>> 1)) {
                                                j = 0 << 32;
                                                j2 = iOException.A03.nextInt();
                                            } else {
                                                j = (i5 + 1) << 32;
                                                j2 = i6;
                                            }
                                            j3 = j2 & 4294967295L;
                                            nextInt = j3 | j;
                                            dataOutputStream = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(file3), 16));
                                            dataOutputStream.writeInt(1);
                                            dataOutputStream.writeLong(nextInt);
                                            dataOutputStream.close();
                                            r03.close();
                                        }
                                    }
                                    dataOutputStream.writeInt(1);
                                    dataOutputStream.writeLong(nextInt);
                                    dataOutputStream.close();
                                    r03.close();
                                } catch (Throwable th2) {
                                    dataOutputStream.close();
                                    throw th2;
                                }
                                j = 0 << 32;
                                j3 = iOException.A03.nextInt() & 4294967295L;
                                nextInt = j3 | j;
                                dataOutputStream = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(file3), 16));
                            } catch (Throwable th3) {
                                th = th3;
                                r03.close();
                            }
                        } finally {
                            IOException iOException2 = iOException;
                        }
                    }
                } catch (Exception e2) {
                    0fH.A0v("BeaconIdGenerator", "Failed to increment beacon id", e2);
                    if (!(e2 instanceof IOException) && !(e2 instanceof OverlappingFileLockException)) {
                        throw e2;
                    }
                    nextInt = (iOException.A03.nextInt() & 4294967295L) | (0 << 32);
                }
                A06.A08("tier", "micro_batch");
                A06.A07(Integer.valueOf((int) (nextInt >> 32)), "beacon_id");
                A06.A07(Integer.valueOf((int) (nextInt & 4294967295L)), "beacon_session_id");
                if (!(A06 instanceof 1Rd)) {
                    1RX r04 = A06.A04;
                    02W.A03("EventBuilder was not acquired: Analytics2Logger null.", r04);
                    if (!r04.A0J.D8e()) {
                        A06.A0G = true;
                    }
                }
                A06.A0B();
                if (r0.A05) {
                    C3mL c3mL = r02.A08;
                    1Rf A002 = 1RX.A00(r02, c3mL.Cxx("falco_data_quality_stream"), num, "falco_data_quality_stream", false);
                    1Rf.A02(A002);
                    A002.A0C = "falco_data_quality_stream_module";
                    if (!(A002 instanceof 1Rd)) {
                        1Rf.A02(A002);
                        A002.A08 = true;
                    }
                    A002.A07(18014398510716552L, "test_int");
                    Double valueOf = Double.valueOf(1.725863284873E9d);
                    A002.A07(valueOf, "test_float");
                    A002.A08("test_string", "Test String to test extra data encoding during transport");
                    A002.A06(true, "test_bool");
                    A002.A0B();
                    1Rf A003 = 1RX.A00(r02, c3mL.Cxx("falco_data_quality_batch"), num, "falco_data_quality_batch", false);
                    1Rf.A02(A003);
                    A003.A0C = "falco_data_quality_batch_module";
                    if (!(A003 instanceof 1Rd)) {
                        1Rf.A02(A003);
                        A003.A08 = true;
                    }
                    A003.A07(18014398510716552L, "test_int");
                    A003.A07(valueOf, "test_float");
                    A003.A08("test_string", "Test String to test extra data encoding during transport");
                    A003.A06(true, "test_bool");
                    A003.A0B();
                }
            }
        }
    }

    public void Bwn(int i) {
    }
}
