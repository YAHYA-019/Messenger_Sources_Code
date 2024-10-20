package X;

import android.os.RemoteException;
import java.util.concurrent.ExecutionException;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.18h, reason: invalid class name */
/* loaded from: 18h.class */
public final class C18h {
    public static final /* synthetic */ C18h[] A00;
    public static final C18h A01;
    public static final C18h A02;
    public static final C18h A03;
    public static final C18h A04;
    public static final C18h A05;
    public static final C18h A06;
    public static final C18h A07;
    public static final C18h A08;
    public static final C18h A09;
    public static final C18h A0A;
    public static final C18h A0B;
    public static final C18h A0C;
    public static final C18h A0D;
    public static final C18h A0E;
    public static final C18h A0F;
    public static final C18h A0G;
    public static final C18h A0H;
    public static final C18h A0I;
    public static final C18h A0J;
    public static final C18h A0K;
    public static final C18h A0L;
    public static final C18h A0M;
    public static final C18h A0N;
    public static final C18h A0O;
    public static final C18h A0P;
    public static final C18h A0Q;
    public static final C18h A0R;
    public static final C18h A0S;
    public static final C18h A0T;
    public static final C18h A0U;
    public static final C18h A0V;
    public static final C18h A0W;
    public static final C18h A0X;
    public static final C18h A0Y;
    public static final C18h A0Z;
    public static final C18h A0a;
    public static final C18h A0b;
    public static final C18h A0c;
    public static final C18h A0d;
    public static final C18h A0e;
    public static final C18h A0f;
    public static final C18h A0g;
    public static final C18h A0h;
    public static final C18h A0i;
    public static final C18h A0j;
    public static final C18h A0k;
    public static final C18h A0l;
    public static final C18h A0m;
    public static final C18h A0n;
    public static final C18h A0o;
    public static final C18h A0p;
    public static final C18h A0q;
    public static final C18h A0r;
    public static final C18h A0s;
    public static final C18h A0t;
    public static final C18h A0u;
    public static final C18h A0v;
    public static final C18h A0w;
    public static final C18h A0x;
    public static final C18h A0y;
    public static final C18h A0z;

    static {
        C18h A022 = A02("UNCATEGORIZED_ERROR", 0);
        A0r = A022;
        C18h A023 = A02("EXECUTION_EXCEPTION", 1);
        A08 = A023;
        C18h A024 = A02("INTERRUPTED_EXCEPTION", 2);
        A0T = A024;
        C18h A025 = A02("REMOTE_EXCEPTION", 3);
        A0l = A025;
        C18h A026 = A02("HUMAN_ERROR", 4);
        A0S = A026;
        C18h A027 = A02("REF_CODE_EXPIRED", 5);
        A0k = A027;
        C18h A028 = A02("USER_ABORT", 6);
        A0t = A028;
        C18h A029 = A02("NOT_CONNECTED", 7);
        A0Z = A029;
        C18h A0210 = A02("CONNECT_FAILED", 8);
        A05 = A0210;
        C18h A0211 = A02("CONNECTION_LOST", 9);
        A04 = A0211;
        C18h A0212 = A02("BY_REQUEST", 10);
        A03 = A0212;
        C18h A0213 = A02("DISCONNECTED", 11);
        A06 = A0213;
        C18h A0214 = A02("STALED_CONNECTION", 12);
        A0q = A0214;
        C18h A0215 = A02("NETWORK_ERROR", 13);
        A0Y = A0215;
        C18h A0216 = A02("MQTT_ERROR", 14);
        A0X = A0216;
        C18h A0217 = A02("FAILED_SOCKET_ERROR", 15);
        A0P = A0217;
        C18h A0218 = A02("FAILED_SOCKET_CONNECT_ERROR", 16);
        A0M = A0218;
        C18h A0219 = A02("FAILED_SOCKET_CONNECT_TIMEOUT", 17);
        A0O = A0219;
        C18h A0220 = A02("FAILED_DNS_RESOLVE_TIMEOUT", 18);
        A0I = A0220;
        C18h A0221 = A02("FAILED_MQTT_CONACK_TIMEOUT", 19);
        A0L = A0221;
        C18h A0222 = A02("FAILED_CONNECT_MESSAGE", 20);
        A0G = A0222;
        C18h A0223 = A02("FAILED_CONNACK_READ", 21);
        A0A = A0223;
        C18h A0224 = A02("FAILED_INVALID_CONACK", 22);
        A0K = A0224;
        C18h A0225 = A02("FAILED_DNS_UNRESOLVED", 23);
        A0J = A0225;
        C18h A0226 = A02("FAILED_CREATE_IOSTREAM", 24);
        A0H = A0226;
        C18h A0227 = A02("FAILED_CONNECTION_REFUSED", 25);
        A0B = A0227;
        C18h A0228 = A02("FAILED_CONNECTION_REFUSED_SERVER_SHEDDING_LOAD", 26);
        A0E = A0228;
        C18h A0229 = A02("FAILED_UNEXPECTED_DISCONNECT", 27);
        A0R = A0229;
        C18h A0230 = A02("FAILED_CONNECTION_REFUSED_BAD_USER_NAME_OR_PASSWORD", 28);
        A0C = A0230;
        C18h A0231 = A02("FAILED_CONNECTION_REFUSED_NOT_AUTHORIZED", 29);
        A0D = A0231;
        C18h A0232 = A02("FAILED_CONNECTION_UNKNOWN_CONNECT_HASH", 30);
        A0F = A0232;
        C18h A0233 = A02("FAILED_SOCKET_CONNECT_ERROR_SSL_CLOCK_SKEW", 31);
        A0N = A0233;
        C18h A0234 = A02("FAILED_STOPPED_BEFORE_SSL", 32);
        A0Q = A0234;
        C18h A0235 = A02("SERVICE_DESTROY", 33);
        A0o = A0235;
        C18h A0236 = A02("SERVICE_STOP", 34);
        A0p = A0236;
        C18h A0237 = A02("KICK_SHOULD_NOT_CONNECT", 35);
        A0W = A0237;
        C18h A0238 = A02("KICK_CONFIG_CHANGED", 36);
        A0V = A0238;
        C18h A0239 = A02("KEEPALIVE_SHOULD_NOT_CONNECT", 37);
        A0U = A0239;
        C18h A0240 = A02("EXPIRE_CONNECTION", 38);
        A09 = A0240;
        C18h A0241 = A02("OPERATION_TIMEOUT", 39);
        A0a = A0241;
        C18h A0242 = A02("PING_UNRECEIVED", 40);
        A0b = A0242;
        C18h A0243 = A02("READ_TIMEOUT", 41);
        A0j = A0243;
        C18h A0244 = A02("READ_EOF", 42);
        A0d = A0244;
        C18h A0245 = A02("READ_SOCKET", 43);
        A0h = A0245;
        C18h A0246 = A02("READ_SSL", 44);
        A0i = A0246;
        C18h A0247 = A02("READ_IO", 45);
        A0g = A0247;
        C18h A0248 = A02("READ_FORMAT", 46);
        A0f = A0248;
        C18h A0249 = A02("READ_FAILURE_UNCLASSIFIED", 47);
        A0e = A0249;
        C18h A0250 = A02("WRITE_TIMEOUT", 48);
        A0z = A0250;
        C18h A0251 = A02("WRITE_EOF", 49);
        A0u = A0251;
        C18h A0252 = A02("WRITE_SOCKET", 50);
        A0x = A0252;
        C18h A0253 = A02("WRITE_SSL", 51);
        A0y = A0253;
        C18h A0254 = A02("WRITE_IO", 52);
        A0w = A0254;
        C18h A0255 = A02("WRITE_FAILURE_UNCLASSIFIED", 53);
        A0v = A0255;
        C18h A0256 = A02("UNKNOWN_RUNTIME", 54);
        A0s = A0256;
        C18h A0257 = A02("SEND_FAILURE", 55);
        A0m = A0257;
        C18h A0258 = A02("DISCONNECT_FROM_SERVER", 56);
        A07 = A0258;
        C18h A0259 = A02("SERIALIZER_FAILURE", 57);
        A0n = A0259;
        C18h A0260 = A02("PREEMPTIVE_RECONNECT_SUCCESS", 58);
        A0c = A0260;
        C18h A0261 = A02("ABORTED_PREEMPTIVE_RECONNECT", 59);
        A01 = A0261;
        C18h A0262 = A02("AUTH_CREDENTIALS_CHANGE", 60);
        A02 = A0262;
        C18h A0263 = A02("NETWORK_LOST", 61);
        C18h[] c18hArr = new C18h[62];
        System.arraycopy(new C18h[]{A022, A023, A024, A025, A026, A027, A028, A029, A0210, A0211, A0212, A0213, A0214, A0215, A0216, A0217, A0218, A0219, A0220, A0221, A0222, A0223, A0224, A0225, A0226, A0227, A0228}, 0, c18hArr, 0, 27);
        System.arraycopy(new C18h[]{A0229, A0230, A0231, A0232, A0233, A0234, A0235, A0236, A0237, A0238, A0239, A0240, A0241, A0242, A0243, A0244, A0245, A0246, A0247, A0248, A0249, A0250, A0251, A0252, A0253, A0254, A0255}, 0, c18hArr, 27, 27);
        System.arraycopy(new C18h[]{A0256, A0257, A0258, A0259, A0260, A0261, A0262, A0263}, 0, c18hArr, 54, 8);
        A00 = c18hArr;
    }

    public C18h(String str, int i) {
    }

    public static C18h A00(Exception exc) {
        return exc instanceof 0Mb ? ((0Mb) exc).mError : exc instanceof ExecutionException ? A08 : exc instanceof InterruptedException ? A0T : exc instanceof RemoteException ? A0l : exc instanceof NullPointerException ? A0S : A0r;
    }

    public static C18h A01(String str) {
        C18h c18h;
        C18h[] values = values();
        int length = values.length;
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= length) {
                c18h = A0r;
                break;
            }
            c18h = values[i2];
            if (c18h.name().equals(str)) {
                break;
            }
            i = i2 + 1;
        }
        return c18h;
    }

    public static C18h A02(String str, int i) {
        return new C18h(str, i);
    }

    public static C18h valueOf(String str) {
        return (C18h) Enum.valueOf(C18h.class, str);
    }

    public static C18h[] values() {
        return (C18h[]) A00.clone();
    }
}
