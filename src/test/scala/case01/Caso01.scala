package case01

import io.gatling.core.Predef._
import io.gatling.http.Predef._

class Caso01 extends Simulation {

  val httpProtocol = http
    .baseUrl("https://dc.services.visualstudio.com")
    .inferHtmlResources()
    .userAgentHeader("Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/85.0.4183.83 Safari/537.36")

  val headers_0 = Map(
    "accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.9",
    "accept-encoding" -> "gzip, deflate, br",
    "accept-language" -> "es-ES,es;q=0.9",
    "sec-fetch-dest" -> "document",
    "sec-fetch-mode" -> "navigate",
    "sec-fetch-site" -> "cross-site",
    "upgrade-insecure-requests" -> "1")

  val headers_1 = Map(
    "Accept" -> "*/*",
    "Accept-Encoding" -> "gzip, deflate, br",
    "Accept-Language" -> "es-ES,es;q=0.9",
    "Sec-Fetch-Dest" -> "script",
    "Sec-Fetch-Mode" -> "no-cors",
    "Sec-Fetch-Site" -> "same-origin")

  val headers_3 = Map(
    "Accept" -> "*/*",
    "Accept-Encoding" -> "gzip, deflate, br",
    "Accept-Language" -> "es-ES,es;q=0.9",
    "Sec-Fetch-Dest" -> "empty",
    "Sec-Fetch-Mode" -> "cors",
    "Sec-Fetch-Site" -> "same-origin")

  val headers_4 = Map(
    "accept" -> "*/*",
    "accept-encoding" -> "gzip, deflate, br",
    "accept-language" -> "es-ES,es;q=0.9",
    "origin" -> "http://localhost:8081",
    "sec-fetch-dest" -> "empty",
    "sec-fetch-mode" -> "cors",
    "sec-fetch-site" -> "cross-site")

  val headers_5 = Map(
    "accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.9",
    "accept-encoding" -> "gzip, deflate, br",
    "accept-language" -> "es-ES,es;q=0.9",
    "sec-fetch-dest" -> "iframe",
    "sec-fetch-mode" -> "navigate",
    "sec-fetch-site" -> "cross-site",
    "upgrade-insecure-requests" -> "1")

  val headers_7 = Map(
    "accept" -> "*/*",
    "accept-encoding" -> "gzip, deflate, br",
    "accept-language" -> "es-ES,es;q=0.9",
    "access-control-request-headers" -> "request-id",
    "access-control-request-method" -> "GET",
    "origin" -> "http://localhost:8081",
    "sec-fetch-dest" -> "empty",
    "sec-fetch-mode" -> "cors",
    "sec-fetch-site" -> "cross-site")

  val headers_8 = Map(
    "accept" -> "*/*",
    "accept-encoding" -> "gzip, deflate, br",
    "accept-language" -> "es-ES,es;q=0.9",
    "origin" -> "http://localhost:8081",
    "request-id" -> "|IC2th.ta5w5",
    "sec-fetch-dest" -> "empty",
    "sec-fetch-mode" -> "cors",
    "sec-fetch-site" -> "cross-site")

  val headers_9 = Map(
    "accept" -> "*/*",
    "accept-encoding" -> "gzip, deflate, br",
    "accept-language" -> "es-ES,es;q=0.9",
    "access-control-request-headers" -> "authorization,request-id",
    "access-control-request-method" -> "GET",
    "origin" -> "http://localhost:8081",
    "sec-fetch-dest" -> "empty",
    "sec-fetch-mode" -> "cors",
    "sec-fetch-site" -> "cross-site")

  val headers_10 = Map(
    "accept" -> "*/*",
    "accept-encoding" -> "gzip, deflate, br",
    "accept-language" -> "es-ES,es;q=0.9",
    "content-type" -> "application/json",
    "origin" -> "http://localhost:8081",
    "sdk-context" -> "appId",
    "sec-fetch-dest" -> "empty",
    "sec-fetch-mode" -> "cors",
    "sec-fetch-site" -> "cross-site")

  val headers_11 = Map(
    "accept" -> "*/*",
    "accept-encoding" -> "gzip, deflate, br",
    "accept-language" -> "es-ES,es;q=0.9",
    "authorization" -> "Bearer _G_sKmWWTXhl3D0xC01g-Usk9a0ce2WcozF4zwIxfDo",
    "origin" -> "http://localhost:8081",
    "request-id" -> "|IC2th.OK/Of",
    "sec-fetch-dest" -> "empty",
    "sec-fetch-mode" -> "cors",
    "sec-fetch-site" -> "cross-site")

  val headers_14 = Map(
    "accept" -> "*/*",
    "accept-encoding" -> "gzip, deflate, br",
    "accept-language" -> "es-ES,es;q=0.9",
    "access-control-request-headers" -> "access-control-allow-origin,content-type,request-context,request-id,uid",
    "access-control-request-method" -> "GET",
    "origin" -> "http://localhost:8081",
    "sec-fetch-dest" -> "empty",
    "sec-fetch-mode" -> "cors",
    "sec-fetch-site" -> "cross-site")

  val headers_15 = Map(
    "accept" -> "*/*",
    "accept-encoding" -> "gzip, deflate, br",
    "accept-language" -> "es-ES,es;q=0.9",
    "access-control-request-headers" -> "access-control-allow-origin,authorization,request-context,request-id,uid",
    "access-control-request-method" -> "GET",
    "origin" -> "http://localhost:8081",
    "sec-fetch-dest" -> "empty",
    "sec-fetch-mode" -> "cors",
    "sec-fetch-site" -> "cross-site")

  val headers_17 = Map(
    "accept" -> "application/json, text/plain, */*",
    "accept-encoding" -> "gzip, deflate, br",
    "accept-language" -> "es-ES,es;q=0.9",
    "access-control-allow-origin" -> "*",
    "content-type" -> "application/json",
    "origin" -> "http://localhost:8081",
    "request-context" -> "appId=cid-v1:5baf8eaf-ca5a-4b24-aab2-eb4d6a570e8a",
    "request-id" -> "|IC2th.1MN5t",
    "sec-fetch-dest" -> "empty",
    "sec-fetch-mode" -> "cors",
    "sec-fetch-site" -> "cross-site",
    "uid" -> "9c14d85f-94bc-46c1-bf75-b31a40fb006b")

  val headers_18 = Map(
    "Accept" -> "*/*",
    "Accept-Encoding" -> "gzip, deflate, br",
    "Accept-Language" -> "es-ES,es;q=0.9",
    "Origin" -> "http://localhost:8081",
    "Sec-Fetch-Dest" -> "font",
    "Sec-Fetch-Mode" -> "cors",
    "Sec-Fetch-Site" -> "same-origin")

  val headers_19 = Map(
    "accept" -> "application/json, text/plain, */*",
    "accept-encoding" -> "gzip, deflate, br",
    "accept-language" -> "es-ES,es;q=0.9",
    "access-control-allow-origin" -> "*",
    "content-type" -> "application/json",
    "origin" -> "http://localhost:8081",
    "request-context" -> "appId=cid-v1:5baf8eaf-ca5a-4b24-aab2-eb4d6a570e8a",
    "request-id" -> "|IC2th.QRBPC",
    "sec-fetch-dest" -> "empty",
    "sec-fetch-mode" -> "cors",
    "sec-fetch-site" -> "cross-site",
    "uid" -> "74db69d0-8fa0-4ba2-8f02-f12e35aba74d")

  val headers_21 = Map(
    "accept" -> "application/json, text/plain, */*",
    "accept-encoding" -> "gzip, deflate, br",
    "accept-language" -> "es-ES,es;q=0.9",
    "access-control-allow-origin" -> "*",
    "authorization" -> "bearer _G_sKmWWTXhl3D0xC01g-Usk9a0ce2WcozF4zwIxfDo",
    "origin" -> "http://localhost:8081",
    "request-context" -> "appId=cid-v1:5baf8eaf-ca5a-4b24-aab2-eb4d6a570e8a",
    "request-id" -> "|IC2th.6V4xS",
    "sec-fetch-dest" -> "empty",
    "sec-fetch-mode" -> "cors",
    "sec-fetch-site" -> "cross-site",
    "uid" -> "aa9db3b2-413e-49fe-9506-6b813a5ca6cc")

  val headers_22 = Map(
    "accept" -> "*/*",
    "accept-encoding" -> "gzip, deflate, br",
    "accept-language" -> "es-ES,es;q=0.9",
    "access-control-request-headers" -> "access-control-allow-origin,content-type,l,request-context,request-id,uid",
    "access-control-request-method" -> "GET",
    "origin" -> "http://localhost:8081",
    "sec-fetch-dest" -> "empty",
    "sec-fetch-mode" -> "cors",
    "sec-fetch-site" -> "cross-site")

  val headers_23 = Map(
    "accept" -> "application/json, text/plain, */*",
    "accept-encoding" -> "gzip, deflate, br",
    "accept-language" -> "es-ES,es;q=0.9",
    "access-control-allow-origin" -> "*",
    "content-type" -> "application/json",
    "l" -> "en-us",
    "origin" -> "http://localhost:8081",
    "request-context" -> "appId=cid-v1:5baf8eaf-ca5a-4b24-aab2-eb4d6a570e8a",
    "request-id" -> "|IC2th.3nYpE",
    "sec-fetch-dest" -> "empty",
    "sec-fetch-mode" -> "cors",
    "sec-fetch-site" -> "cross-site",
    "uid" -> "0756c3c1-0953-4de6-963f-142bfe16cd58")

  val headers_24 = Map(
    "accept" -> "*/*",
    "accept-encoding" -> "gzip, deflate, br",
    "accept-language" -> "es-ES,es;q=0.9",
    "access-control-request-headers" -> "access-control-allow-origin,authorization,content-type,l,request-context,request-id,uid",
    "access-control-request-method" -> "GET",
    "origin" -> "http://localhost:8081",
    "sec-fetch-dest" -> "empty",
    "sec-fetch-mode" -> "cors",
    "sec-fetch-site" -> "cross-site")

  val headers_25 = Map(
    "accept" -> "application/json, text/plain, */*",
    "accept-encoding" -> "gzip, deflate, br",
    "accept-language" -> "es-ES,es;q=0.9",
    "access-control-allow-origin" -> "*",
    "authorization" -> "bearer _G_sKmWWTXhl3D0xC01g-Usk9a0ce2WcozF4zwIxfDo",
    "content-type" -> "application/json",
    "l" -> "en-us",
    "origin" -> "http://localhost:8081",
    "request-context" -> "appId=cid-v1:5baf8eaf-ca5a-4b24-aab2-eb4d6a570e8a",
    "request-id" -> "|IC2th.QwxUe",
    "sec-fetch-dest" -> "empty",
    "sec-fetch-mode" -> "cors",
    "sec-fetch-site" -> "cross-site",
    "uid" -> "bdf65736-14de-49ae-b822-c354c505b852")

  val headers_27 = Map(
    "Accept" -> "image/avif,image/webp,image/apng,image/*,*/*;q=0.8",
    "Accept-Encoding" -> "gzip, deflate, br",
    "Accept-Language" -> "es-ES,es;q=0.9",
    "Sec-Fetch-Dest" -> "image",
    "Sec-Fetch-Mode" -> "no-cors",
    "Sec-Fetch-Site" -> "same-origin")

  val headers_32 = Map(
    "accept" -> "application/json, text/plain, */*",
    "accept-encoding" -> "gzip, deflate, br",
    "accept-language" -> "es-ES,es;q=0.9",
    "access-control-allow-origin" -> "*",
    "authorization" -> "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJzdWIiOiIxIiwianRpIjoiNWExNTMwNTItZjJkNS00ZmVlLTg1MTQtNjBjOWVhZTNkMmVhIiwiQWxsIjoiU1hFIiwiRGFzaGJvYXJkLkhpZ2hMZXZlbCI6IlNYRSIsIkRhc2hib2FyZC5TaGlwbWVudCI6IlNYRSIsIkRhc2hib2FyZC5TdG9jayI6IlNYRSIsIkZ1bGZpbG1lbnQuU2NhblBhY2thZ2UiOiJTWEUiLCJGdWxmaWxtZW50LlNoaXBtZW50IjoiU1hFIiwiRnVsZmlsbWVudC5VbnBhY2siOiJTWEUiLCJGdWxmaWxtZW50LlVucGFja01hbnVhbGx5IjoiU1hFIiwiSW52ZW50b3J5LlN0b2NrIjoiU1hFIiwiUmVwb3J0aW5nLkVucXVpcnkiOiJTWEUiLCJTZWN1cml0eS5FdmVudCI6IlNYRSIsIlNlY3VyaXR5LlJvbGUiOiJTWEUiLCJTZWN1cml0eS5Vc2VyIjoiU1hFIiwiU2V0dXAuQ2VudGVyIjoiU1hFIiwiU2V0dXAuRGVsaXZlcnlOb3RlIjoiU1hFIiwiU2V0dXAuUHJvZHVjdCI6IlNYRSIsIlNldHVwLlByb2R1Y3RUeXBlIjoiU1hFIiwiU2V0dXAuU2VydmljZVByb3ZpZGVyIjoiU1hFIiwiU2hpcG1lbnQuRnVsZmlsbWVudFN0YXR1cyI6IlNYRSIsIlNoaXBtZW50LlNoaXBtZW50U3RhdHVzIjoiU1hFIiwiZXZlbnRJZCI6IjEiLCJhY2NvdW50SWQiOiIxIiwiYXVkIjoiRU9TQXBpIiwiZXhwIjoxNjAwMDA1MjQ2LCJpc3MiOiJBcHAifQ.1PjkjjfsJASgkuDmdoDiShnqLau1Uur7sn2VyWrsBcY",
    "content-type" -> "application/json",
    "l" -> "en-us",
    "origin" -> "http://localhost:8081",
    "request-context" -> "appId=cid-v1:5baf8eaf-ca5a-4b24-aab2-eb4d6a570e8a",
    "request-id" -> "|IC2th.0Zmxg",
    "sec-fetch-dest" -> "empty",
    "sec-fetch-mode" -> "cors",
    "sec-fetch-site" -> "cross-site",
    "uid" -> "11379e81-05bf-4d64-8ce3-67262c5ddb7b")

  val headers_35 = Map(
    "accept" -> "application/json, text/plain, */*",
    "accept-encoding" -> "gzip, deflate, br",
    "accept-language" -> "es-ES,es;q=0.9",
    "access-control-allow-origin" -> "*",
    "authorization" -> "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJzdWIiOiIxIiwianRpIjoiNWExNTMwNTItZjJkNS00ZmVlLTg1MTQtNjBjOWVhZTNkMmVhIiwiQWxsIjoiU1hFIiwiRGFzaGJvYXJkLkhpZ2hMZXZlbCI6IlNYRSIsIkRhc2hib2FyZC5TaGlwbWVudCI6IlNYRSIsIkRhc2hib2FyZC5TdG9jayI6IlNYRSIsIkZ1bGZpbG1lbnQuU2NhblBhY2thZ2UiOiJTWEUiLCJGdWxmaWxtZW50LlNoaXBtZW50IjoiU1hFIiwiRnVsZmlsbWVudC5VbnBhY2siOiJTWEUiLCJGdWxmaWxtZW50LlVucGFja01hbnVhbGx5IjoiU1hFIiwiSW52ZW50b3J5LlN0b2NrIjoiU1hFIiwiUmVwb3J0aW5nLkVucXVpcnkiOiJTWEUiLCJTZWN1cml0eS5FdmVudCI6IlNYRSIsIlNlY3VyaXR5LlJvbGUiOiJTWEUiLCJTZWN1cml0eS5Vc2VyIjoiU1hFIiwiU2V0dXAuQ2VudGVyIjoiU1hFIiwiU2V0dXAuRGVsaXZlcnlOb3RlIjoiU1hFIiwiU2V0dXAuUHJvZHVjdCI6IlNYRSIsIlNldHVwLlByb2R1Y3RUeXBlIjoiU1hFIiwiU2V0dXAuU2VydmljZVByb3ZpZGVyIjoiU1hFIiwiU2hpcG1lbnQuRnVsZmlsbWVudFN0YXR1cyI6IlNYRSIsIlNoaXBtZW50LlNoaXBtZW50U3RhdHVzIjoiU1hFIiwiZXZlbnRJZCI6IjEiLCJhY2NvdW50SWQiOiIxIiwiYXVkIjoiRU9TQXBpIiwiZXhwIjoxNjAwMDA1MjQ2LCJpc3MiOiJBcHAifQ.1PjkjjfsJASgkuDmdoDiShnqLau1Uur7sn2VyWrsBcY",
    "content-type" -> "application/json",
    "l" -> "en-us",
    "origin" -> "http://localhost:8081",
    "request-context" -> "appId=cid-v1:5baf8eaf-ca5a-4b24-aab2-eb4d6a570e8a",
    "request-id" -> "|IC2th.KUa37",
    "sec-fetch-dest" -> "empty",
    "sec-fetch-mode" -> "cors",
    "sec-fetch-site" -> "cross-site",
    "uid" -> "0b1493cd-4af1-4b2a-9861-39fe2b4f51fa")

  val headers_36 = Map(
    "accept" -> "application/json, text/plain, */*",
    "accept-encoding" -> "gzip, deflate, br",
    "accept-language" -> "es-ES,es;q=0.9",
    "access-control-allow-origin" -> "*",
    "authorization" -> "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJzdWIiOiIxIiwianRpIjoiNWExNTMwNTItZjJkNS00ZmVlLTg1MTQtNjBjOWVhZTNkMmVhIiwiQWxsIjoiU1hFIiwiRGFzaGJvYXJkLkhpZ2hMZXZlbCI6IlNYRSIsIkRhc2hib2FyZC5TaGlwbWVudCI6IlNYRSIsIkRhc2hib2FyZC5TdG9jayI6IlNYRSIsIkZ1bGZpbG1lbnQuU2NhblBhY2thZ2UiOiJTWEUiLCJGdWxmaWxtZW50LlNoaXBtZW50IjoiU1hFIiwiRnVsZmlsbWVudC5VbnBhY2siOiJTWEUiLCJGdWxmaWxtZW50LlVucGFja01hbnVhbGx5IjoiU1hFIiwiSW52ZW50b3J5LlN0b2NrIjoiU1hFIiwiUmVwb3J0aW5nLkVucXVpcnkiOiJTWEUiLCJTZWN1cml0eS5FdmVudCI6IlNYRSIsIlNlY3VyaXR5LlJvbGUiOiJTWEUiLCJTZWN1cml0eS5Vc2VyIjoiU1hFIiwiU2V0dXAuQ2VudGVyIjoiU1hFIiwiU2V0dXAuRGVsaXZlcnlOb3RlIjoiU1hFIiwiU2V0dXAuUHJvZHVjdCI6IlNYRSIsIlNldHVwLlByb2R1Y3RUeXBlIjoiU1hFIiwiU2V0dXAuU2VydmljZVByb3ZpZGVyIjoiU1hFIiwiU2hpcG1lbnQuRnVsZmlsbWVudFN0YXR1cyI6IlNYRSIsIlNoaXBtZW50LlNoaXBtZW50U3RhdHVzIjoiU1hFIiwiZXZlbnRJZCI6IjEiLCJhY2NvdW50SWQiOiIxIiwiYXVkIjoiRU9TQXBpIiwiZXhwIjoxNjAwMDA1MjQ2LCJpc3MiOiJBcHAifQ.1PjkjjfsJASgkuDmdoDiShnqLau1Uur7sn2VyWrsBcY",
    "content-type" -> "application/json",
    "l" -> "en-us",
    "origin" -> "http://localhost:8081",
    "request-context" -> "appId=cid-v1:5baf8eaf-ca5a-4b24-aab2-eb4d6a570e8a",
    "request-id" -> "|IC2th.nvGro",
    "sec-fetch-dest" -> "empty",
    "sec-fetch-mode" -> "cors",
    "sec-fetch-site" -> "cross-site",
    "uid" -> "8c9e5bd3-7bcb-47b9-ae9c-df1afa96174a")

  val headers_41 = Map(
    "accept" -> "application/json, text/plain, */*",
    "accept-encoding" -> "gzip, deflate, br",
    "accept-language" -> "es-ES,es;q=0.9",
    "access-control-allow-origin" -> "*",
    "authorization" -> "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJzdWIiOiIxIiwianRpIjoiNWExNTMwNTItZjJkNS00ZmVlLTg1MTQtNjBjOWVhZTNkMmVhIiwiQWxsIjoiU1hFIiwiRGFzaGJvYXJkLkhpZ2hMZXZlbCI6IlNYRSIsIkRhc2hib2FyZC5TaGlwbWVudCI6IlNYRSIsIkRhc2hib2FyZC5TdG9jayI6IlNYRSIsIkZ1bGZpbG1lbnQuU2NhblBhY2thZ2UiOiJTWEUiLCJGdWxmaWxtZW50LlNoaXBtZW50IjoiU1hFIiwiRnVsZmlsbWVudC5VbnBhY2siOiJTWEUiLCJGdWxmaWxtZW50LlVucGFja01hbnVhbGx5IjoiU1hFIiwiSW52ZW50b3J5LlN0b2NrIjoiU1hFIiwiUmVwb3J0aW5nLkVucXVpcnkiOiJTWEUiLCJTZWN1cml0eS5FdmVudCI6IlNYRSIsIlNlY3VyaXR5LlJvbGUiOiJTWEUiLCJTZWN1cml0eS5Vc2VyIjoiU1hFIiwiU2V0dXAuQ2VudGVyIjoiU1hFIiwiU2V0dXAuRGVsaXZlcnlOb3RlIjoiU1hFIiwiU2V0dXAuUHJvZHVjdCI6IlNYRSIsIlNldHVwLlByb2R1Y3RUeXBlIjoiU1hFIiwiU2V0dXAuU2VydmljZVByb3ZpZGVyIjoiU1hFIiwiU2hpcG1lbnQuRnVsZmlsbWVudFN0YXR1cyI6IlNYRSIsIlNoaXBtZW50LlNoaXBtZW50U3RhdHVzIjoiU1hFIiwiZXZlbnRJZCI6IjEiLCJhY2NvdW50SWQiOiIxIiwiYXVkIjoiRU9TQXBpIiwiZXhwIjoxNjAwMDA1MjQ2LCJpc3MiOiJBcHAifQ.1PjkjjfsJASgkuDmdoDiShnqLau1Uur7sn2VyWrsBcY",
    "content-type" -> "application/json",
    "l" -> "en-us",
    "origin" -> "http://localhost:8081",
    "request-context" -> "appId=cid-v1:5baf8eaf-ca5a-4b24-aab2-eb4d6a570e8a",
    "request-id" -> "|IC2th.YjNH/",
    "sec-fetch-dest" -> "empty",
    "sec-fetch-mode" -> "cors",
    "sec-fetch-site" -> "cross-site",
    "uid" -> "e097518e-56b2-4c32-a728-850eea57b4fd")

  val headers_42 = Map(
    "accept" -> "application/json, text/plain, */*",
    "accept-encoding" -> "gzip, deflate, br",
    "accept-language" -> "es-ES,es;q=0.9",
    "access-control-allow-origin" -> "*",
    "authorization" -> "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJzdWIiOiIxIiwianRpIjoiNWExNTMwNTItZjJkNS00ZmVlLTg1MTQtNjBjOWVhZTNkMmVhIiwiQWxsIjoiU1hFIiwiRGFzaGJvYXJkLkhpZ2hMZXZlbCI6IlNYRSIsIkRhc2hib2FyZC5TaGlwbWVudCI6IlNYRSIsIkRhc2hib2FyZC5TdG9jayI6IlNYRSIsIkZ1bGZpbG1lbnQuU2NhblBhY2thZ2UiOiJTWEUiLCJGdWxmaWxtZW50LlNoaXBtZW50IjoiU1hFIiwiRnVsZmlsbWVudC5VbnBhY2siOiJTWEUiLCJGdWxmaWxtZW50LlVucGFja01hbnVhbGx5IjoiU1hFIiwiSW52ZW50b3J5LlN0b2NrIjoiU1hFIiwiUmVwb3J0aW5nLkVucXVpcnkiOiJTWEUiLCJTZWN1cml0eS5FdmVudCI6IlNYRSIsIlNlY3VyaXR5LlJvbGUiOiJTWEUiLCJTZWN1cml0eS5Vc2VyIjoiU1hFIiwiU2V0dXAuQ2VudGVyIjoiU1hFIiwiU2V0dXAuRGVsaXZlcnlOb3RlIjoiU1hFIiwiU2V0dXAuUHJvZHVjdCI6IlNYRSIsIlNldHVwLlByb2R1Y3RUeXBlIjoiU1hFIiwiU2V0dXAuU2VydmljZVByb3ZpZGVyIjoiU1hFIiwiU2hpcG1lbnQuRnVsZmlsbWVudFN0YXR1cyI6IlNYRSIsIlNoaXBtZW50LlNoaXBtZW50U3RhdHVzIjoiU1hFIiwiZXZlbnRJZCI6IjEiLCJhY2NvdW50SWQiOiIxIiwiYXVkIjoiRU9TQXBpIiwiZXhwIjoxNjAwMDA1MjQ2LCJpc3MiOiJBcHAifQ.1PjkjjfsJASgkuDmdoDiShnqLau1Uur7sn2VyWrsBcY",
    "content-type" -> "application/json",
    "l" -> "en-us",
    "origin" -> "http://localhost:8081",
    "request-context" -> "appId=cid-v1:5baf8eaf-ca5a-4b24-aab2-eb4d6a570e8a",
    "request-id" -> "|IC2th.lNVXl",
    "sec-fetch-dest" -> "empty",
    "sec-fetch-mode" -> "cors",
    "sec-fetch-site" -> "cross-site",
    "uid" -> "27718d35-ebb5-4410-b9ed-63ce5a5cdc2c")

  val headers_45 = Map(
    "accept" -> "application/json, text/plain, */*",
    "accept-encoding" -> "gzip, deflate, br",
    "accept-language" -> "es-ES,es;q=0.9",
    "access-control-allow-origin" -> "*",
    "authorization" -> "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJzdWIiOiIxIiwianRpIjoiNWExNTMwNTItZjJkNS00ZmVlLTg1MTQtNjBjOWVhZTNkMmVhIiwiQWxsIjoiU1hFIiwiRGFzaGJvYXJkLkhpZ2hMZXZlbCI6IlNYRSIsIkRhc2hib2FyZC5TaGlwbWVudCI6IlNYRSIsIkRhc2hib2FyZC5TdG9jayI6IlNYRSIsIkZ1bGZpbG1lbnQuU2NhblBhY2thZ2UiOiJTWEUiLCJGdWxmaWxtZW50LlNoaXBtZW50IjoiU1hFIiwiRnVsZmlsbWVudC5VbnBhY2siOiJTWEUiLCJGdWxmaWxtZW50LlVucGFja01hbnVhbGx5IjoiU1hFIiwiSW52ZW50b3J5LlN0b2NrIjoiU1hFIiwiUmVwb3J0aW5nLkVucXVpcnkiOiJTWEUiLCJTZWN1cml0eS5FdmVudCI6IlNYRSIsIlNlY3VyaXR5LlJvbGUiOiJTWEUiLCJTZWN1cml0eS5Vc2VyIjoiU1hFIiwiU2V0dXAuQ2VudGVyIjoiU1hFIiwiU2V0dXAuRGVsaXZlcnlOb3RlIjoiU1hFIiwiU2V0dXAuUHJvZHVjdCI6IlNYRSIsIlNldHVwLlByb2R1Y3RUeXBlIjoiU1hFIiwiU2V0dXAuU2VydmljZVByb3ZpZGVyIjoiU1hFIiwiU2hpcG1lbnQuRnVsZmlsbWVudFN0YXR1cyI6IlNYRSIsIlNoaXBtZW50LlNoaXBtZW50U3RhdHVzIjoiU1hFIiwiZXZlbnRJZCI6IjEiLCJhY2NvdW50SWQiOiIxIiwiYXVkIjoiRU9TQXBpIiwiZXhwIjoxNjAwMDA1MjQ2LCJpc3MiOiJBcHAifQ.1PjkjjfsJASgkuDmdoDiShnqLau1Uur7sn2VyWrsBcY",
    "content-type" -> "application/json",
    "l" -> "en-us",
    "origin" -> "http://localhost:8081",
    "request-context" -> "appId=cid-v1:5baf8eaf-ca5a-4b24-aab2-eb4d6a570e8a",
    "request-id" -> "|IC2th.X3M5x",
    "sec-fetch-dest" -> "empty",
    "sec-fetch-mode" -> "cors",
    "sec-fetch-site" -> "cross-site",
    "uid" -> "b0bb0240-8a7a-4240-bcff-c8651d2548cf")

  val headers_47 = Map(
    "accept" -> "*/*",
    "accept-encoding" -> "gzip, deflate, br",
    "accept-language" -> "es-ES,es;q=0.9",
    "access-control-request-headers" -> "access-control-allow-origin,authorization,content-type,l,request-context,request-id,uid",
    "access-control-request-method" -> "POST",
    "origin" -> "http://localhost:8081",
    "sec-fetch-dest" -> "empty",
    "sec-fetch-mode" -> "cors",
    "sec-fetch-site" -> "cross-site")

  val headers_48 = Map(
    "accept" -> "application/json, text/plain, */*",
    "accept-encoding" -> "gzip, deflate, br",
    "accept-language" -> "es-ES,es;q=0.9",
    "access-control-allow-origin" -> "*",
    "authorization" -> "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJzdWIiOiIxIiwianRpIjoiNWExNTMwNTItZjJkNS00ZmVlLTg1MTQtNjBjOWVhZTNkMmVhIiwiQWxsIjoiU1hFIiwiRGFzaGJvYXJkLkhpZ2hMZXZlbCI6IlNYRSIsIkRhc2hib2FyZC5TaGlwbWVudCI6IlNYRSIsIkRhc2hib2FyZC5TdG9jayI6IlNYRSIsIkZ1bGZpbG1lbnQuU2NhblBhY2thZ2UiOiJTWEUiLCJGdWxmaWxtZW50LlNoaXBtZW50IjoiU1hFIiwiRnVsZmlsbWVudC5VbnBhY2siOiJTWEUiLCJGdWxmaWxtZW50LlVucGFja01hbnVhbGx5IjoiU1hFIiwiSW52ZW50b3J5LlN0b2NrIjoiU1hFIiwiUmVwb3J0aW5nLkVucXVpcnkiOiJTWEUiLCJTZWN1cml0eS5FdmVudCI6IlNYRSIsIlNlY3VyaXR5LlJvbGUiOiJTWEUiLCJTZWN1cml0eS5Vc2VyIjoiU1hFIiwiU2V0dXAuQ2VudGVyIjoiU1hFIiwiU2V0dXAuRGVsaXZlcnlOb3RlIjoiU1hFIiwiU2V0dXAuUHJvZHVjdCI6IlNYRSIsIlNldHVwLlByb2R1Y3RUeXBlIjoiU1hFIiwiU2V0dXAuU2VydmljZVByb3ZpZGVyIjoiU1hFIiwiU2hpcG1lbnQuRnVsZmlsbWVudFN0YXR1cyI6IlNYRSIsIlNoaXBtZW50LlNoaXBtZW50U3RhdHVzIjoiU1hFIiwiZXZlbnRJZCI6IjEiLCJhY2NvdW50SWQiOiIxIiwiYXVkIjoiRU9TQXBpIiwiZXhwIjoxNjAwMDA1MjQ2LCJpc3MiOiJBcHAifQ.1PjkjjfsJASgkuDmdoDiShnqLau1Uur7sn2VyWrsBcY",
    "content-type" -> "application/json",
    "l" -> "en-us",
    "origin" -> "http://localhost:8081",
    "request-context" -> "appId=cid-v1:5baf8eaf-ca5a-4b24-aab2-eb4d6a570e8a",
    "request-id" -> "|IC2th.eUQib",
    "sec-fetch-dest" -> "empty",
    "sec-fetch-mode" -> "cors",
    "sec-fetch-site" -> "cross-site",
    "uid" -> "18eb7729-5805-40d0-9ca5-1c554e61c81e")

  val headers_49 = Map(
    "accept" -> "*/*",
    "accept-encoding" -> "gzip, deflate, br",
    "accept-language" -> "es-ES,es;q=0.9",
    "access-control-request-headers" -> "access-control-allow-origin,authorization,l,request-context,request-id,uid",
    "access-control-request-method" -> "GET",
    "origin" -> "http://localhost:8081",
    "sec-fetch-dest" -> "empty",
    "sec-fetch-mode" -> "cors",
    "sec-fetch-site" -> "cross-site")

  val headers_50 = Map(
    "accept" -> "*/*",
    "accept-encoding" -> "gzip, deflate, br",
    "accept-language" -> "es-ES,es;q=0.9",
    "if-modified-since" -> "Thu, 23 Jul 2020 17:43:26 GMT",
    "sec-fetch-dest" -> "script",
    "sec-fetch-mode" -> "no-cors",
    "sec-fetch-site" -> "cross-site",
    "x-client-data" -> "CI22yQEIpbbJAQjBtskBCKmdygEIjKHKAQiZtcoBCKC4ygEI58jKAQjpyMoBCLTLygEI2dfKAQ==")

  val headers_51 = Map(
    "accept" -> "application/json, text/plain, */*",
    "accept-encoding" -> "gzip, deflate, br",
    "accept-language" -> "es-ES,es;q=0.9",
    "access-control-allow-origin" -> "*",
    "authorization" -> "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJzdWIiOiIxIiwianRpIjoiNWExNTMwNTItZjJkNS00ZmVlLTg1MTQtNjBjOWVhZTNkMmVhIiwiQWxsIjoiU1hFIiwiRGFzaGJvYXJkLkhpZ2hMZXZlbCI6IlNYRSIsIkRhc2hib2FyZC5TaGlwbWVudCI6IlNYRSIsIkRhc2hib2FyZC5TdG9jayI6IlNYRSIsIkZ1bGZpbG1lbnQuU2NhblBhY2thZ2UiOiJTWEUiLCJGdWxmaWxtZW50LlNoaXBtZW50IjoiU1hFIiwiRnVsZmlsbWVudC5VbnBhY2siOiJTWEUiLCJGdWxmaWxtZW50LlVucGFja01hbnVhbGx5IjoiU1hFIiwiSW52ZW50b3J5LlN0b2NrIjoiU1hFIiwiUmVwb3J0aW5nLkVucXVpcnkiOiJTWEUiLCJTZWN1cml0eS5FdmVudCI6IlNYRSIsIlNlY3VyaXR5LlJvbGUiOiJTWEUiLCJTZWN1cml0eS5Vc2VyIjoiU1hFIiwiU2V0dXAuQ2VudGVyIjoiU1hFIiwiU2V0dXAuRGVsaXZlcnlOb3RlIjoiU1hFIiwiU2V0dXAuUHJvZHVjdCI6IlNYRSIsIlNldHVwLlByb2R1Y3RUeXBlIjoiU1hFIiwiU2V0dXAuU2VydmljZVByb3ZpZGVyIjoiU1hFIiwiU2hpcG1lbnQuRnVsZmlsbWVudFN0YXR1cyI6IlNYRSIsIlNoaXBtZW50LlNoaXBtZW50U3RhdHVzIjoiU1hFIiwiZXZlbnRJZCI6IjEiLCJhY2NvdW50SWQiOiIxIiwiYXVkIjoiRU9TQXBpIiwiZXhwIjoxNjAwMDA1MjQ2LCJpc3MiOiJBcHAifQ.1PjkjjfsJASgkuDmdoDiShnqLau1Uur7sn2VyWrsBcY",
    "content-type" -> "application/json",
    "l" -> "en-us",
    "origin" -> "http://localhost:8081",
    "request-context" -> "appId=cid-v1:5baf8eaf-ca5a-4b24-aab2-eb4d6a570e8a",
    "request-id" -> "|IC2th.sm3N8",
    "sec-fetch-dest" -> "empty",
    "sec-fetch-mode" -> "cors",
    "sec-fetch-site" -> "cross-site",
    "uid" -> "ccfbd953-7d9c-4b18-b19e-32b6f965b228")

  val headers_52 = Map(
    "accept" -> "*/*",
    "accept-encoding" -> "gzip, deflate, br",
    "accept-language" -> "es-ES,es;q=0.9",
    "if-modified-since" -> "Wed, 08 Jul 2020 22:21:37 GMT",
    "sec-fetch-dest" -> "script",
    "sec-fetch-mode" -> "no-cors",
    "sec-fetch-site" -> "cross-site",
    "x-client-data" -> "CI22yQEIpbbJAQjBtskBCKmdygEIjKHKAQiZtcoBCKC4ygEI58jKAQjpyMoBCLTLygEI2dfKAQ==")

  val headers_53 = Map(
    "accept" -> "text/css,*/*;q=0.1",
    "accept-encoding" -> "gzip, deflate, br",
    "accept-language" -> "es-ES,es;q=0.9",
    "if-modified-since" -> "Wed, 08 Jul 2020 22:32:32 GMT",
    "sec-fetch-dest" -> "style",
    "sec-fetch-mode" -> "no-cors",
    "sec-fetch-site" -> "cross-site",
    "x-client-data" -> "CI22yQEIpbbJAQjBtskBCKmdygEIjKHKAQiZtcoBCKC4ygEI58jKAQjpyMoBCLTLygEI2dfKAQ==")

  val headers_57 = Map(
    "accept" -> "*/*",
    "accept-encoding" -> "gzip, deflate, br",
    "accept-language" -> "es-ES,es;q=0.9",
    "if-modified-since" -> "Wed, 08 Jul 2020 22:27:07 GMT",
    "sec-fetch-dest" -> "script",
    "sec-fetch-mode" -> "no-cors",
    "sec-fetch-site" -> "cross-site",
    "x-client-data" -> "CI22yQEIpbbJAQjBtskBCKmdygEIjKHKAQiZtcoBCKC4ygEI58jKAQjpyMoBCLTLygEI2dfKAQ==")

  val headers_60 = Map(
    "accept" -> "*/*",
    "accept-encoding" -> "gzip, deflate, br",
    "accept-language" -> "es-ES,es;q=0.9",
    "if-modified-since" -> "Wed, 08 Jul 2020 22:32:37 GMT",
    "sec-fetch-dest" -> "script",
    "sec-fetch-mode" -> "no-cors",
    "sec-fetch-site" -> "cross-site",
    "x-client-data" -> "CI22yQEIpbbJAQjBtskBCKmdygEIjKHKAQiZtcoBCKC4ygEI58jKAQjpyMoBCLTLygEI2dfKAQ==")

  val headers_61 = Map(
    "accept" -> "*/*",
    "accept-encoding" -> "gzip, deflate, br",
    "accept-language" -> "es-ES,es;q=0.9",
    "if-modified-since" -> "Wed, 08 Jul 2020 22:33:01 GMT",
    "sec-fetch-dest" -> "script",
    "sec-fetch-mode" -> "no-cors",
    "sec-fetch-site" -> "cross-site",
    "x-client-data" -> "CI22yQEIpbbJAQjBtskBCKmdygEIjKHKAQiZtcoBCKC4ygEI58jKAQjpyMoBCLTLygEI2dfKAQ==")

  val headers_67 = Map(
    "accept" -> "application/json, text/plain, */*",
    "accept-encoding" -> "gzip, deflate, br",
    "accept-language" -> "es-ES,es;q=0.9",
    "access-control-allow-origin" -> "*",
    "authorization" -> "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJzdWIiOiIxIiwianRpIjoiNWExNTMwNTItZjJkNS00ZmVlLTg1MTQtNjBjOWVhZTNkMmVhIiwiQWxsIjoiU1hFIiwiRGFzaGJvYXJkLkhpZ2hMZXZlbCI6IlNYRSIsIkRhc2hib2FyZC5TaGlwbWVudCI6IlNYRSIsIkRhc2hib2FyZC5TdG9jayI6IlNYRSIsIkZ1bGZpbG1lbnQuU2NhblBhY2thZ2UiOiJTWEUiLCJGdWxmaWxtZW50LlNoaXBtZW50IjoiU1hFIiwiRnVsZmlsbWVudC5VbnBhY2siOiJTWEUiLCJGdWxmaWxtZW50LlVucGFja01hbnVhbGx5IjoiU1hFIiwiSW52ZW50b3J5LlN0b2NrIjoiU1hFIiwiUmVwb3J0aW5nLkVucXVpcnkiOiJTWEUiLCJTZWN1cml0eS5FdmVudCI6IlNYRSIsIlNlY3VyaXR5LlJvbGUiOiJTWEUiLCJTZWN1cml0eS5Vc2VyIjoiU1hFIiwiU2V0dXAuQ2VudGVyIjoiU1hFIiwiU2V0dXAuRGVsaXZlcnlOb3RlIjoiU1hFIiwiU2V0dXAuUHJvZHVjdCI6IlNYRSIsIlNldHVwLlByb2R1Y3RUeXBlIjoiU1hFIiwiU2V0dXAuU2VydmljZVByb3ZpZGVyIjoiU1hFIiwiU2hpcG1lbnQuRnVsZmlsbWVudFN0YXR1cyI6IlNYRSIsIlNoaXBtZW50LlNoaXBtZW50U3RhdHVzIjoiU1hFIiwiZXZlbnRJZCI6IjEiLCJhY2NvdW50SWQiOiIxIiwiYXVkIjoiRU9TQXBpIiwiZXhwIjoxNjAwMDA1MjQ2LCJpc3MiOiJBcHAifQ.1PjkjjfsJASgkuDmdoDiShnqLau1Uur7sn2VyWrsBcY",
    "l" -> "en-us",
    "origin" -> "http://localhost:8081",
    "request-context" -> "appId=cid-v1:5baf8eaf-ca5a-4b24-aab2-eb4d6a570e8a",
    "request-id" -> "|IC2th.F1gKF",
    "sec-fetch-dest" -> "empty",
    "sec-fetch-mode" -> "cors",
    "sec-fetch-site" -> "cross-site",
    "uid" -> "7a4bc64f-fa55-4a9f-86bf-7b2ad94972e3")

  val headers_70 = Map(
    "accept" -> "application/json, text/plain, */*",
    "accept-encoding" -> "gzip, deflate, br",
    "accept-language" -> "es-ES,es;q=0.9",
    "access-control-allow-origin" -> "*",
    "authorization" -> "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJzdWIiOiIxIiwianRpIjoiNWExNTMwNTItZjJkNS00ZmVlLTg1MTQtNjBjOWVhZTNkMmVhIiwiQWxsIjoiU1hFIiwiRGFzaGJvYXJkLkhpZ2hMZXZlbCI6IlNYRSIsIkRhc2hib2FyZC5TaGlwbWVudCI6IlNYRSIsIkRhc2hib2FyZC5TdG9jayI6IlNYRSIsIkZ1bGZpbG1lbnQuU2NhblBhY2thZ2UiOiJTWEUiLCJGdWxmaWxtZW50LlNoaXBtZW50IjoiU1hFIiwiRnVsZmlsbWVudC5VbnBhY2siOiJTWEUiLCJGdWxmaWxtZW50LlVucGFja01hbnVhbGx5IjoiU1hFIiwiSW52ZW50b3J5LlN0b2NrIjoiU1hFIiwiUmVwb3J0aW5nLkVucXVpcnkiOiJTWEUiLCJTZWN1cml0eS5FdmVudCI6IlNYRSIsIlNlY3VyaXR5LlJvbGUiOiJTWEUiLCJTZWN1cml0eS5Vc2VyIjoiU1hFIiwiU2V0dXAuQ2VudGVyIjoiU1hFIiwiU2V0dXAuRGVsaXZlcnlOb3RlIjoiU1hFIiwiU2V0dXAuUHJvZHVjdCI6IlNYRSIsIlNldHVwLlByb2R1Y3RUeXBlIjoiU1hFIiwiU2V0dXAuU2VydmljZVByb3ZpZGVyIjoiU1hFIiwiU2hpcG1lbnQuRnVsZmlsbWVudFN0YXR1cyI6IlNYRSIsIlNoaXBtZW50LlNoaXBtZW50U3RhdHVzIjoiU1hFIiwiZXZlbnRJZCI6IjEiLCJhY2NvdW50SWQiOiIxIiwiYXVkIjoiRU9TQXBpIiwiZXhwIjoxNjAwMDA1MjQ2LCJpc3MiOiJBcHAifQ.1PjkjjfsJASgkuDmdoDiShnqLau1Uur7sn2VyWrsBcY",
    "l" -> "en-us",
    "origin" -> "http://localhost:8081",
    "request-context" -> "appId=cid-v1:5baf8eaf-ca5a-4b24-aab2-eb4d6a570e8a",
    "request-id" -> "|IC2th.kY6Mr",
    "sec-fetch-dest" -> "empty",
    "sec-fetch-mode" -> "cors",
    "sec-fetch-site" -> "cross-site",
    "uid" -> "e47d5fa3-114d-4c48-bf88-882327c5b3cf")

  val headers_73 = Map(
    "accept" -> "application/json, text/plain, */*",
    "accept-encoding" -> "gzip, deflate, br",
    "accept-language" -> "es-ES,es;q=0.9",
    "access-control-allow-origin" -> "*",
    "authorization" -> "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJzdWIiOiIxIiwianRpIjoiNWExNTMwNTItZjJkNS00ZmVlLTg1MTQtNjBjOWVhZTNkMmVhIiwiQWxsIjoiU1hFIiwiRGFzaGJvYXJkLkhpZ2hMZXZlbCI6IlNYRSIsIkRhc2hib2FyZC5TaGlwbWVudCI6IlNYRSIsIkRhc2hib2FyZC5TdG9jayI6IlNYRSIsIkZ1bGZpbG1lbnQuU2NhblBhY2thZ2UiOiJTWEUiLCJGdWxmaWxtZW50LlNoaXBtZW50IjoiU1hFIiwiRnVsZmlsbWVudC5VbnBhY2siOiJTWEUiLCJGdWxmaWxtZW50LlVucGFja01hbnVhbGx5IjoiU1hFIiwiSW52ZW50b3J5LlN0b2NrIjoiU1hFIiwiUmVwb3J0aW5nLkVucXVpcnkiOiJTWEUiLCJTZWN1cml0eS5FdmVudCI6IlNYRSIsIlNlY3VyaXR5LlJvbGUiOiJTWEUiLCJTZWN1cml0eS5Vc2VyIjoiU1hFIiwiU2V0dXAuQ2VudGVyIjoiU1hFIiwiU2V0dXAuRGVsaXZlcnlOb3RlIjoiU1hFIiwiU2V0dXAuUHJvZHVjdCI6IlNYRSIsIlNldHVwLlByb2R1Y3RUeXBlIjoiU1hFIiwiU2V0dXAuU2VydmljZVByb3ZpZGVyIjoiU1hFIiwiU2hpcG1lbnQuRnVsZmlsbWVudFN0YXR1cyI6IlNYRSIsIlNoaXBtZW50LlNoaXBtZW50U3RhdHVzIjoiU1hFIiwiZXZlbnRJZCI6IjEiLCJhY2NvdW50SWQiOiIxIiwiYXVkIjoiRU9TQXBpIiwiZXhwIjoxNjAwMDA1MjQ2LCJpc3MiOiJBcHAifQ.1PjkjjfsJASgkuDmdoDiShnqLau1Uur7sn2VyWrsBcY",
    "content-type" -> "application/json",
    "l" -> "en-us",
    "origin" -> "http://localhost:8081",
    "request-context" -> "appId=cid-v1:5baf8eaf-ca5a-4b24-aab2-eb4d6a570e8a",
    "request-id" -> "|IC2th./5Tsy",
    "sec-fetch-dest" -> "empty",
    "sec-fetch-mode" -> "cors",
    "sec-fetch-site" -> "cross-site",
    "uid" -> "fe6c5692-9070-4b03-a08d-9697b61b3085")

  val headers_75 = Map(
    "accept" -> "application/json, text/plain, */*",
    "accept-encoding" -> "gzip, deflate, br",
    "accept-language" -> "es-ES,es;q=0.9",
    "access-control-allow-origin" -> "*",
    "authorization" -> "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJzdWIiOiIxIiwianRpIjoiNWExNTMwNTItZjJkNS00ZmVlLTg1MTQtNjBjOWVhZTNkMmVhIiwiQWxsIjoiU1hFIiwiRGFzaGJvYXJkLkhpZ2hMZXZlbCI6IlNYRSIsIkRhc2hib2FyZC5TaGlwbWVudCI6IlNYRSIsIkRhc2hib2FyZC5TdG9jayI6IlNYRSIsIkZ1bGZpbG1lbnQuU2NhblBhY2thZ2UiOiJTWEUiLCJGdWxmaWxtZW50LlNoaXBtZW50IjoiU1hFIiwiRnVsZmlsbWVudC5VbnBhY2siOiJTWEUiLCJGdWxmaWxtZW50LlVucGFja01hbnVhbGx5IjoiU1hFIiwiSW52ZW50b3J5LlN0b2NrIjoiU1hFIiwiUmVwb3J0aW5nLkVucXVpcnkiOiJTWEUiLCJTZWN1cml0eS5FdmVudCI6IlNYRSIsIlNlY3VyaXR5LlJvbGUiOiJTWEUiLCJTZWN1cml0eS5Vc2VyIjoiU1hFIiwiU2V0dXAuQ2VudGVyIjoiU1hFIiwiU2V0dXAuRGVsaXZlcnlOb3RlIjoiU1hFIiwiU2V0dXAuUHJvZHVjdCI6IlNYRSIsIlNldHVwLlByb2R1Y3RUeXBlIjoiU1hFIiwiU2V0dXAuU2VydmljZVByb3ZpZGVyIjoiU1hFIiwiU2hpcG1lbnQuRnVsZmlsbWVudFN0YXR1cyI6IlNYRSIsIlNoaXBtZW50LlNoaXBtZW50U3RhdHVzIjoiU1hFIiwiZXZlbnRJZCI6IjEiLCJhY2NvdW50SWQiOiIxIiwiYXVkIjoiRU9TQXBpIiwiZXhwIjoxNjAwMDA1MjQ2LCJpc3MiOiJBcHAifQ.1PjkjjfsJASgkuDmdoDiShnqLau1Uur7sn2VyWrsBcY",
    "content-type" -> "application/json",
    "l" -> "en-us",
    "origin" -> "http://localhost:8081",
    "request-context" -> "appId=cid-v1:5baf8eaf-ca5a-4b24-aab2-eb4d6a570e8a",
    "request-id" -> "|IC2th.xtxgS",
    "sec-fetch-dest" -> "empty",
    "sec-fetch-mode" -> "cors",
    "sec-fetch-site" -> "cross-site",
    "uid" -> "3a06eb2f-9c1a-4000-8ea2-77550bf02139")

  val headers_79 = Map(
    "accept" -> "application/json, text/plain, */*",
    "accept-encoding" -> "gzip, deflate, br",
    "accept-language" -> "es-ES,es;q=0.9",
    "access-control-allow-origin" -> "*",
    "authorization" -> "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJzdWIiOiIxIiwianRpIjoiNWExNTMwNTItZjJkNS00ZmVlLTg1MTQtNjBjOWVhZTNkMmVhIiwiQWxsIjoiU1hFIiwiRGFzaGJvYXJkLkhpZ2hMZXZlbCI6IlNYRSIsIkRhc2hib2FyZC5TaGlwbWVudCI6IlNYRSIsIkRhc2hib2FyZC5TdG9jayI6IlNYRSIsIkZ1bGZpbG1lbnQuU2NhblBhY2thZ2UiOiJTWEUiLCJGdWxmaWxtZW50LlNoaXBtZW50IjoiU1hFIiwiRnVsZmlsbWVudC5VbnBhY2siOiJTWEUiLCJGdWxmaWxtZW50LlVucGFja01hbnVhbGx5IjoiU1hFIiwiSW52ZW50b3J5LlN0b2NrIjoiU1hFIiwiUmVwb3J0aW5nLkVucXVpcnkiOiJTWEUiLCJTZWN1cml0eS5FdmVudCI6IlNYRSIsIlNlY3VyaXR5LlJvbGUiOiJTWEUiLCJTZWN1cml0eS5Vc2VyIjoiU1hFIiwiU2V0dXAuQ2VudGVyIjoiU1hFIiwiU2V0dXAuRGVsaXZlcnlOb3RlIjoiU1hFIiwiU2V0dXAuUHJvZHVjdCI6IlNYRSIsIlNldHVwLlByb2R1Y3RUeXBlIjoiU1hFIiwiU2V0dXAuU2VydmljZVByb3ZpZGVyIjoiU1hFIiwiU2hpcG1lbnQuRnVsZmlsbWVudFN0YXR1cyI6IlNYRSIsIlNoaXBtZW50LlNoaXBtZW50U3RhdHVzIjoiU1hFIiwiZXZlbnRJZCI6IjEiLCJhY2NvdW50SWQiOiIxIiwiYXVkIjoiRU9TQXBpIiwiZXhwIjoxNjAwMDA1MjQ2LCJpc3MiOiJBcHAifQ.1PjkjjfsJASgkuDmdoDiShnqLau1Uur7sn2VyWrsBcY",
    "content-type" -> "application/json",
    "l" -> "en-us",
    "origin" -> "http://localhost:8081",
    "request-context" -> "appId=cid-v1:5baf8eaf-ca5a-4b24-aab2-eb4d6a570e8a",
    "request-id" -> "|IC2th.GVOeD",
    "sec-fetch-dest" -> "empty",
    "sec-fetch-mode" -> "cors",
    "sec-fetch-site" -> "cross-site",
    "uid" -> "7a5ac4f3-8d0f-4185-89f5-dda2dee00899")

  val uri1 = "localhost"
  val uri2 = "https://az416426.vo.msecnd.net/scripts/a/ai.0.js"
  val uri4 = "https://byris4tfs-31.azurewebsites.net/id4"
  val uri5 = "https://www.gstatic.com/charts"

  val scn = scenario("Caso01")
    .exec(http("request_0")
      .get(uri4 + "/connect/authorize?client_id=EOSSuite_Dev&redirect_uri=http%3A%2F%2Flocalhost%3A8081%2Fcallback&response_type=token%20id_token&scope=EOSApi%20openid%20profile&state=52417a1984ac4fde89c92aeabd91ca64&nonce=135e5feddafd48e0b4001c2378d04a3f")
      .headers(headers_0)
      .resources(http("request_1")
        .get("http://" + uri1 + ":8081/24.js")
        .headers(headers_1),
        http("request_2")
          .get(uri2),
        http("request_3")
          .get("http://" + uri1 + ":8081/sockjs-node/info?t=1599995242252")
          .headers(headers_3),
        http("request_4")
          .get(uri4 + "/.well-known/openid-configuration")
          .headers(headers_4),
        http("request_5")
          .get(uri4 + "/connect/checksession")
          .headers(headers_5),
        http("request_6")
          .get(uri4 + "/.well-known/openid-configuration")
          .headers(headers_4),
        http("request_7")
          .options(uri4 + "/.well-known/openid-configuration/jwks")
          .headers(headers_7),
        http("request_8")
          .get(uri4 + "/.well-known/openid-configuration/jwks")
          .headers(headers_8),
        http("request_9")
          .options(uri4 + "/connect/userinfo")
          .headers(headers_9),
        http("request_10")
          .post("/v2/track")
          .headers(headers_10)
          .body(RawFileBody("/caso01/0010_request.json")),
        http("request_11")
          .get(uri4 + "/connect/userinfo")
          .headers(headers_11),
        http("request_12")
          .get("http://" + uri1 + ":8081/chunk-common.js")
          .headers(headers_1),
        http("request_13")
          .get("http://" + uri1 + ":8081/21.js")
          .headers(headers_1),
        http("request_14")
          .options("https://" + uri1 + ":44395/api/v1/Localization/SupportedLanguages")
          .headers(headers_14),
        http("request_15")
          .options("https://" + uri1 + ":44395/api/v1/Security/UserSurrogates?userId=1")
          .headers(headers_15),
        http("request_16")
          .options("https://" + uri1 + ":44395/api/v1/Localization/LanguageCallArray?culture=en-us&arrResource=[%22shared%22]")
          .headers(headers_14),
        http("request_17")
          .get("https://" + uri1 + ":44395/api/v1/Localization/SupportedLanguages")
          .headers(headers_17),
        http("request_18")
          .get("http://" + uri1 + ":8081/fonts/flUhRq6tzZclQEJ-Vdg-IuiaDsNcIhQ8tQ.woff2")
          .headers(headers_18),
        http("request_19")
          .get("https://" + uri1 + ":44395/api/v1/Localization/LanguageCallArray?culture=en-us&arrResource=[%22shared%22]")
          .headers(headers_19),
        http("request_20")
          .post("/v2/track")
          .headers(headers_10)
          .body(RawFileBody("/caso01/0020_request.json")),
        http("request_21")
          .get("https://" + uri1 + ":44395/api/v1/Security/UserSurrogates?userId=1")
          .headers(headers_21),
        http("request_22")
          .options("https://" + uri1 + ":44395/api/v1/Localization/LanguageCallArray?culture=en-us&arrResource=[%22menu%22,%22SharedResource%22,%22menugroup%22]")
          .headers(headers_22),
        http("request_23")
          .get("https://" + uri1 + ":44395/api/v1/Localization/LanguageCallArray?culture=en-us&arrResource=[%22menu%22,%22SharedResource%22,%22menugroup%22]")
          .headers(headers_23),
        http("request_24")
          .options("https://" + uri1 + ":44395/api/v1/Token?eventId=1&surrogateId=1")
          .headers(headers_24),
        http("request_25")
          .get("https://" + uri1 + ":44395/api/v1/Token?eventId=1&surrogateId=1")
          .headers(headers_25),
        http("request_26")
          .get("http://" + uri1 + ":8081/18.js")
          .headers(headers_1),
        http("request_27")
          .get("http://" + uri1 + ":8081/img/logo_big.png")
          .headers(headers_27),
        http("request_28")
          .get("http://" + uri1 + ":8081/img/logo_small.png")
          .headers(headers_27),
        http("request_29")
          .get("http://" + uri1 + ":8081/fonts/fa-solid-900.woff2")
          .headers(headers_18),
        http("request_30")
          .get("http://" + uri1 + ":8081/undefined")
          .headers(headers_27),
        http("request_31")
          .options("https://" + uri1 + ":44395/api/v1/Localization/LanguageCall?culture=en-us&resourceKey=dashboardHighLevel")
          .headers(headers_24),
        http("request_32")
          .get("https://" + uri1 + ":44395/api/v1/Localization/LanguageCall?culture=en-us&resourceKey=dashboardHighLevel")
          .headers(headers_32),
        http("request_33")
          .options("https://" + uri1 + ":44395/api/v1/Reporting/getDashboardByCode?code=SHIPMENTHIGHLEVEL")
          .headers(headers_24),
        http("request_34")
          .options("https://" + uri1 + ":44395/api/v1/Reporting/getDashboardByCode?code=STOCKHIGHLEVEL")
          .headers(headers_24),
        http("request_35")
          .get("https://" + uri1 + ":44395/api/v1/Reporting/getDashboardByCode?code=SHIPMENTHIGHLEVEL")
          .headers(headers_35),
        http("request_36")
          .get("https://" + uri1 + ":44395/api/v1/Reporting/getDashboardByCode?code=STOCKHIGHLEVEL")
          .headers(headers_36),
        http("request_37")
          .post("/v2/track")
          .headers(headers_10)
          .body(RawFileBody("/caso01/0037_request.json"))))
    .pause(8)
    .exec(http("request_38")
      .get("http://" + uri1 + ":8081/4.js")
      .headers(headers_1)
      .resources(http("request_39")
        .options("https://" + uri1 + ":44395/api/v1/Center/GetCenterLookupByUser")
        .headers(headers_24),
        http("request_40")
          .options("https://" + uri1 + ":44395/api/v1/Localization/LanguageCall?culture=en-us&resourceKey=searchStock")
          .headers(headers_24),
        http("request_41")
          .get("https://" + uri1 + ":44395/api/v1/Center/GetCenterLookupByUser")
          .headers(headers_41),
        http("request_42")
          .get("https://" + uri1 + ":44395/api/v1/Localization/LanguageCall?culture=en-us&resourceKey=searchStock")
          .headers(headers_42),
        http("request_43")
          .options("https://" + uri1 + ":44395/api/v1/ProductType/GetProductTypeLookup")
          .headers(headers_24),
        http("request_44")
          .options("https://" + uri1 + ":44395/api/v1/Reporting/getDashboardByCode?code=STOCKSUMMARY")
          .headers(headers_24),
        http("request_45")
          .get("https://" + uri1 + ":44395/api/v1/ProductType/GetProductTypeLookup")
          .headers(headers_45),
        http("request_46")
          .post("/v2/track")
          .headers(headers_10)
          .body(RawFileBody("/caso01/0046_request.json")),
        http("request_47")
          .options("https://" + uri1 + ":44395/api/v1/Inventory/StockPaginate")
          .headers(headers_47),
        http("request_48")
          .get("https://" + uri1 + ":44395/api/v1/Reporting/getDashboardByCode?code=STOCKSUMMARY")
          .headers(headers_48),
        http("request_49")
          .options("https://" + uri1 + ":44395/api/v1/Reporting/GetStockSummaryDashboard?excel=0&useShortDate=true")
          .headers(headers_49),
        http("request_50")
          .get(uri5 + "/loader.js")
          .headers(headers_50),
        http("request_51")
          .post("https://" + uri1 + ":44395/api/v1/Inventory/StockPaginate")
          .headers(headers_51)
          .body(RawFileBody("/caso01/0051_request.json")),
        http("request_52")
          .get(uri5 + "/49/loader.js")
          .headers(headers_52),
        http("request_53")
          .get(uri5 + "/49/css/util/util.css")
          .headers(headers_53),
        http("request_54")
          .get(uri5 + "/49/css/util/format.css")
          .headers(headers_53),
        http("request_55")
          .get(uri5 + "/49/css/table/table.css")
          .headers(headers_53),
        http("request_56")
          .get(uri5 + "/49/css/core/tooltip.css")
          .headers(headers_53),
        http("request_57")
          .get(uri5 + "/49/js/jsapi_compiled_graphics_module.js")
          .headers(headers_57),
        http("request_58")
          .get(uri5 + "/49/js/jsapi_compiled_corechart_module.js")
          .headers(headers_57),
        http("request_59")
          .get(uri5 + "/49/js/jsapi_compiled_controls_module.js")
          .headers(headers_57),
        http("request_60")
          .get(uri5 + "/49/third_party/dygraphs/dygraph-tickers-combined.js")
          .headers(headers_60),
        http("request_61")
          .get(uri5 + "/49/third_party/webfontloader/webfont.js")
          .headers(headers_61),
        http("request_62")
          .get(uri5 + "/49/js/jsapi_compiled_table_module.js")
          .headers(headers_57),
        http("request_63")
          .get(uri5 + "/49/js/jsapi_compiled_fw_module.js")
          .headers(headers_57),
        http("request_64")
          .get(uri5 + "/49/js/jsapi_compiled_default_module.js")
          .headers(headers_57),
        http("request_65")
          .get(uri5 + "/49/js/jsapi_compiled_ui_module.js")
          .headers(headers_57),
        http("request_66")
          .get(uri5 + "/49/js/jsapi_compiled_timeline_module.js")
          .headers(headers_57),
        http("request_67")
          .get("https://" + uri1 + ":44395/api/v1/Reporting/GetStockSummaryDashboard?excel=0&useShortDate=true")
          .headers(headers_67),
        http("request_68")
          .get(uri5 + "/49/css/controls/controls.css")
          .headers(headers_53),
        http("request_69")
          .get(uri5 + "/49/js/jsapi_compiled_bar_module.js")
          .headers(headers_57),
        http("request_70")
          .get("https://" + uri1 + ":44395/api/v1/Reporting/GetStockSummaryDashboard?excel=0&useShortDate=true")
          .headers(headers_70)))
    .pause(4)
    .exec(http("request_71")
      .get("http://" + uri1 + ":8081/3.js")
      .headers(headers_1)
      .resources(http("request_72")
        .options("https://" + uri1 + ":44395/api/v1/Localization/LanguageCall?culture=en-us&resourceKey=searchStoreItem")
        .headers(headers_24),
        http("request_73")
          .get("https://" + uri1 + ":44395/api/v1/Localization/LanguageCall?culture=en-us&resourceKey=searchStoreItem")
          .headers(headers_73),
        http("request_74")
          .options("https://" + uri1 + ":44395/api/v1/ProductType/GetProductTypeByProductTypeLookup")
          .headers(headers_24),
        http("request_75")
          .get("https://" + uri1 + ":44395/api/v1/ProductType/GetProductTypeByProductTypeLookup")
          .headers(headers_75),
        http("request_76")
          .post("/v2/track")
          .headers(headers_10)
          .body(RawFileBody("/caso01/0076_request.json"))))
    .pause(14)
    .exec(http("request_77")
      .post("/v2/track")
      .headers(headers_10)
      .body(RawFileBody("/caso01/0077_request.json")))
    .pause(2)
    .exec(http("request_78")
      .options("https://" + uri1 + ":44395/api/v1/Inventory/AddStoreItems")
      .headers(headers_47)
      .resources(http("request_79")
        .post("https://" + uri1 + ":44395/api/v1/Inventory/AddStoreItems")
        .headers(headers_79)
        .body(RawFileBody("/caso01/0079_request.json"))))
    .pause(15)
    .exec(http("request_80")
      .post("/v2/track")
      .headers(headers_10)
      .body(RawFileBody("/caso01/0080_request.json")))

  setUp(scn.inject(atOnceUsers(1))).protocols(httpProtocol)
}