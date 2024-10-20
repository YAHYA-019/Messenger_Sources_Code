package X;

/* renamed from: X.4j2, reason: invalid class name and case insensitive filesystem */
/* loaded from: 4j2.class */
public enum EnumC07184j2 implements C07n {
    CLIENT_SEND_REQUEST("client_send_request"),
    CLIENT_RECEIVE_RESPONSE_NULL("client_receive_response_null"),
    /* JADX INFO: Fake field, exist only in values array */
    CLIENT_RECEIVE_RESPONSE_LAUNCH_FLOW("client_receive_response_launch_flow"),
    CLIENT_ERROR("client_error"),
    CLIENT_FLOW_LAUNCH("client_flow_launch"),
    /* JADX INFO: Fake field, exist only in values array */
    CLIENT_REACT_NATIVE_FLOW_LAUNCH("client_react_native_flow_launch"),
    /* JADX INFO: Fake field, exist only in values array */
    SERVER_NULL_RESPONSE("server_null_response"),
    /* JADX INFO: Fake field, exist only in values array */
    SERVER_LAUNCH_FLOW_RESPONSE("server_launch_flow_response"),
    /* JADX INFO: Fake field, exist only in values array */
    SERVER_ELIGIBILITY_RESPONSE("server_eligibility_response");

    public final String mValue;

    EnumC07184j2(String str) {
        this.mValue = str;
    }

    @Override // X.C07n
    public /* bridge */ /* synthetic */ Object getValue() {
        return this.mValue;
    }
}
