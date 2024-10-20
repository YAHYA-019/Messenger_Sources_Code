package X;

import java.io.EOFException;
import java.io.IOException;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.util.concurrent.TimeoutException;
import java.util.zip.DataFormatException;
import javax.net.ssl.SSLException;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.18e, reason: invalid class name */
/* loaded from: 18e.class */
public final class C18e {
    public static final /* synthetic */ C18e[] A00;
    public static final C18e A01;
    public static final C18e A02;
    public static final C18e A03;
    public static final C18e A04;
    public static final C18e A05;
    public static final C18e A06;
    public static final C18e A07;
    public static final C18e A08;
    public static final C18e A09;
    public static final C18e A0A;
    public static final C18e A0B;
    public static final C18e A0C;
    public static final C18e A0D;
    public static final C18e A0E;
    public static final C18e A0F;
    public static final C18e A0G;
    public static final C18e A0H;
    public static final C18e A0I;
    public static final C18e A0J;
    public static final C18e A0K;
    public static final C18e A0L;
    public static final C18e A0M;
    public static final C18e A0N;
    public static final C18e A0O;
    public static final C18e A0P;
    public static final C18e A0Q;
    public static final C18e A0R;
    public static final C18e A0S;
    public static final C18e A0T;

    static {
        C18e c18e = new C18e("SERVICE_DESTROY", 0);
        A0L = c18e;
        C18e c18e2 = new C18e("SERVICE_STOP", 1);
        A0M = c18e2;
        C18e c18e3 = new C18e("KICK_SHOULD_NOT_CONNECT", 2);
        A07 = c18e3;
        C18e c18e4 = new C18e("KICK_CONFIG_CHANGED", 3);
        A06 = c18e4;
        C18e c18e5 = new C18e("KEEPALIVE_SHOULD_NOT_CONNECT", 4);
        A05 = c18e5;
        C18e c18e6 = new C18e("EXPIRE_CONNECTION", 5);
        A04 = c18e6;
        C18e c18e7 = new C18e("OPERATION_TIMEOUT", 6);
        A09 = c18e7;
        C18e c18e8 = new C18e("PING_UNRECEIVED", 7);
        A0A = c18e8;
        C18e c18e9 = new C18e("READ_TIMEOUT", 8);
        A0I = c18e9;
        C18e c18e10 = new C18e("READ_EOF", 9);
        A0C = c18e10;
        C18e c18e11 = new C18e("READ_SOCKET", 10);
        A0G = c18e11;
        C18e c18e12 = new C18e("READ_SSL", 11);
        A0H = c18e12;
        C18e c18e13 = new C18e("READ_IO", 12);
        A0F = c18e13;
        C18e c18e14 = new C18e("READ_FORMAT", 13);
        A0E = c18e14;
        C18e c18e15 = new C18e("READ_FAILURE_UNCLASSIFIED", 14);
        A0D = c18e15;
        C18e c18e16 = new C18e("WRITE_TIMEOUT", 15);
        A0T = c18e16;
        C18e c18e17 = new C18e("WRITE_EOF", 16);
        A0O = c18e17;
        C18e c18e18 = new C18e("WRITE_SOCKET", 17);
        A0R = c18e18;
        C18e c18e19 = new C18e("WRITE_SSL", 18);
        A0S = c18e19;
        C18e c18e20 = new C18e("WRITE_IO", 19);
        A0Q = c18e20;
        C18e c18e21 = new C18e("WRITE_FAILURE_UNCLASSIFIED", 20);
        A0P = c18e21;
        C18e c18e22 = new C18e("UNKNOWN_RUNTIME", 21);
        A0N = c18e22;
        C18e c18e23 = new C18e("SEND_FAILURE", 22);
        A0J = c18e23;
        C18e c18e24 = new C18e("DISCONNECT_FROM_SERVER", 23);
        A03 = c18e24;
        C18e c18e25 = new C18e("SERIALIZER_FAILURE", 24);
        A0K = c18e25;
        C18e c18e26 = new C18e("PREEMPTIVE_RECONNECT_SUCCESS", 25);
        A0B = c18e26;
        C18e c18e27 = new C18e("ABORTED_PREEMPTIVE_RECONNECT", 26);
        A01 = c18e27;
        C18e c18e28 = new C18e("AUTH_CREDENTIALS_CHANGE", 27);
        A02 = c18e28;
        C18e c18e29 = new C18e("NETWORK_LOST", 28);
        A08 = c18e29;
        C18e[] c18eArr = new C18e[29];
        System.arraycopy(new C18e[]{c18e, c18e2, c18e3, c18e4, c18e5, c18e6, c18e7, c18e8, c18e9, c18e10, c18e11, c18e12, c18e13, c18e14, c18e15, c18e16, c18e17, c18e18, c18e19, c18e20, c18e21, c18e22, c18e23, c18e24, c18e25, c18e26, c18e27}, 0, c18eArr, 0, 27);
        System.arraycopy(new C18e[]{c18e28, c18e29}, 0, c18eArr, 27, 2);
        A00 = c18eArr;
    }

    public C18e(String str, int i) {
    }

    public static C18e A00(Throwable th) {
        return ((th instanceof TimeoutException) || (th instanceof SocketTimeoutException)) ? A0I : th instanceof EOFException ? A0C : th instanceof SocketException ? A0G : th instanceof SSLException ? A0H : th instanceof IOException ? A0F : th instanceof DataFormatException ? A0E : A0D;
    }

    public static C18e A01(Throwable th) {
        return ((th instanceof TimeoutException) || (th instanceof SocketTimeoutException)) ? A0T : th instanceof EOFException ? A0O : th instanceof SocketException ? A0R : th instanceof SSLException ? A0S : th instanceof IOException ? A0Q : A0P;
    }

    public static C18e valueOf(String str) {
        return (C18e) Enum.valueOf(C18e.class, str);
    }

    public static C18e[] values() {
        return (C18e[]) A00.clone();
    }
}
