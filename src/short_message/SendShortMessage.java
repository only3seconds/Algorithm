//package short_message;
//
//import java.util.List;
//import java.util.Map;
//
///**
// * @author thinking-ppp 2020/11/14
// */
//public class SendShortMessage {
//
//  public JSONObject sendMspShortMessage(JSONObject jsonObject) {
//
//    try {
//      // 判断 tenantId 是否为空
//      String tenantId = BaseUtils.getTenantId();
//      if (CommonUtil.isEmpty(tenantId)) {
//        AiccLog.security("The tenantId is empty");
//        return new JSONObject(
//            CommonUtil.constructObjectReponse(FAILED_CODE, "The tenantId cannot be empty"));
//      }
//
//      // 判断 json 是否位空
//      if (CommonUtil.isEmpty(jsonObject)) {
//        isException = true;
//        AiccLog.security("The jsonObject is empty");
//        return new JSONObject(
//            CommonUtil.constructObjectReponse(FAILED_CODE, "The jsonObject cannot be empty"));
//      }
//
//      // 判断 templateId 是否为空
//      if (CommonUtil.isEmpty(jsonObject.getString("templateId"))) {
//        AiccLog.security("The templateId is empty");
//        return new JSONObject(
//            CommonUtil.constructObjectReponse(FAILED_CODE, "The templateId cannot be empty"));
//      }
//
//      // TODO 判断模版变量variables的个数是否超过10个
//      Map<String, String> variablesMap = jsonObject.get("variables");
//      if (CommonUtil.isNotEmpty(variablesMap) && variablesMap.size() > 10) {
//        AiccLog.security("The variables > 10");
//        return new JSONObject(
//            CommonUtil.constructObjectReponse(FAILED_CODE, "The variables > 10"));
//
//      }
//
//      // TODO 判断 sendTime 格式是否符合要求
//      String sendTime = jsonObject.getString("sendTime");
//      if (CommonUtil.isNotEmpty(sendTime) && !ValidateUtil.validSendTime(sendTime)) {
//        AiccLog.security("The sendTime={} is invalid. ", sendTime);
//        return new JSONObject(
//            CommonUtil.constructObjectReponse(FAILED_CODE, "The sendTime is invalid"));
//      }
//
//      // TODO 判断模版变量receiverIds中的手机号格式是否正确
//      List<String> receiverList = jsonObject.getList("receiverIds");
//      if (CommonUtil.isNotEmpty(receiverList)) {
//        for (String phoneNumber: receiverList) {
//          if (!ValidateUtil.validPhoneNumber(phoneNumber)) {
//            AiccLog.security("The receiverIds={} invalid. ", receiverIds);
//            return new JSONObject(
//                CommonUtil.constructObjectReponse(FAILED_CODE, "The receiverIds invalid"));
//          }
//        }
//      }
//
//      jsonObject.put("isThird", true);
//      JSONObject results = sendMessageService.sendTenantMspSms(jsonObject);
//      operLogs(isSuccess(true, results));
//      return results;
//      // TODO 记录成功 by th
//    } catch (Exception ex) {
//      // TODO 记录失败 by th
//      operLogs(isSuccess(false, null));
//      throw ex;
//    }
//
//  }
//
//  private void operLogs(String successFlag) {
//    // String successFlag = isSuccess(isException, results);
//    // 记录日志
//    String name = "";
//    String content = I18nUtil.getMessage("OPERLOGS.SENDMESSAGE.TENANTSMS", SUMUtils.getLocale());
//    String id = BaseUtils.getuserAccount();
//    Map<String, String> operlogs = SUMUtils
//        .constructOperLogParams("sendSysMspSms", "SendedMessage", id, name, content, successFlag);
//    try {
//      SUMUtils.addOperlog(operlogs);
//    } catch (Exception e) {
//      log.error("exception is sendSysSms while adding operation log.TenantSpaceId is {}",
//          BaseUtils.getTenantId());
//    }
//  }
//
//}
