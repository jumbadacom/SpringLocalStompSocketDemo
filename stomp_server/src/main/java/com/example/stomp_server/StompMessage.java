package com.example.stomp_server;

import java.util.HashMap;
import java.util.Map;

public class StompMessage {
	  private Map<String, String> headers = new HashMap<>();
	    private String body="";
	    private String command;
		public Map<String, String> getHeaders() {
			return headers;
		}
		public void setHeaders(Map<String, String> headers) {
			this.headers = headers;
		}
		public String getBody() {
			return body;
		}
		public void setBody(String body) {
			this.body = body;
		}
		public String getCommand() {
			return command;
		}
		public void setCommand(String command) {
			this.command = command;
		}
		@Override
		public String toString() {
			StringBuilder builder = new StringBuilder();
			builder.append("StompMessage [headers=");
			builder.append(headers);
			builder.append(", body=");
			builder.append(body);
			builder.append(", command=");
			builder.append(command);
			builder.append("]");
			return builder.toString();
		}
	    
	    
}
