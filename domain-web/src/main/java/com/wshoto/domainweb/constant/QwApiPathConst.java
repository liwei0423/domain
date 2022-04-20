package com.wshoto.domainweb.constant;

import com.wshoto.domainstarter.util.DomainProperties;

public class QwApiPathConst {

    public final static String GET_PRE_AUTH_CODE = DomainProperties.qqmap+"cgi-bin/service/get_pre_auth_code";
    public final static String CORP_TO_OPEN_CORPID = DomainProperties.qqmap+"cgi-bin/service/corpid_to_opencorpid";
    public final static String USERID_TO_OPENUSERID = DomainProperties.qqmap+"cgi-bin/batch/userid_to_openuserid";
    public final static String GET_NEW_EXTERNAL_USERID = DomainProperties.qqmap+"cgi-bin/externalcontact/get_new_external_userid";
    public final static String TO_SERVICE_EXTERNAL_USERID = DomainProperties.qqmap+"cgi-bin/externalcontact/to_service_external_userid";
    public final static String UNIONID_TO_EXTERNAL_USERID_3RD = DomainProperties.qqmap+"cgi-bin/service/externalcontact/unionid_to_external_userid_3rd";

    /**
     * 客户联系-离职继承
     */
    public final static String GET_UNASSIGNED_LIST = DomainProperties.qqmap+"cgi-bin/externalcontact/get_unassigned_list";
    public final static String TRANSFER_CUSTOMER = DomainProperties.qqmap+"cgi-bin/externalcontact/resigned/transfer_customer";
    public final static String TRANSFER_RESULT = DomainProperties.qqmap+"cgi-bin/externalcontact/resigned/transfer_result";
    public final static String GROUPCHAT_TRANSFER = DomainProperties.qqmap+"cgi-bin/externalcontact/groupchat/transfer";

    public final static String KF_SEND_MSG_ON_EVENT = DomainProperties.qqmap+"cgi-bin/kf/send_msg_on_event";

    public final static String GET_MOBILE_HASHCODE = DomainProperties.qqmap+"cgi-bin/user/get_mobile_hashcode";


    /**
     * 客户联系-客户朋友圈
     */
    public final static String GET_MOMENT_CUSTOMER_LIST = DomainProperties.qqmap+"cgi-bin/externalcontact/get_moment_customer_list";
    public final static String GET_MOMENT_SEND_RESULT = DomainProperties.qqmap+"cgi-bin/externalcontact/get_moment_send_result";
    public final static String GET_MOMENT_COMMENTS = DomainProperties.qqmap+"cgi-bin/externalcontact/get_moment_comments";


}
