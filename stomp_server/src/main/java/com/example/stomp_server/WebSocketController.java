package com.example.stomp_server;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.DestinationVariable;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
public class WebSocketController {
	
	@Autowired
	private SimpMessagingTemplate simpMessagingTemplate;
	
	@MessageMapping("/chat.private.{username}")
	public void filterPrivateMessage(@Payload SendMessageVm sendMessageVm, @DestinationVariable("username") String username ) throws IOException {
		 log.info("message recieved to -> "+username);
		simpMessagingTemplate.convertAndSend(   "/topic/test" , sendMessageVm.getMessage()+" from server");
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	/*
    @Autowired
   private WebSocketService socketService;
	*/
    /*    
	    @MessageMapping("/echo-msg")
	    @SendTo("/greetings")
	    public String echoMessageMapping( String message) {
		 log.info("test echoMessageMapping : "+message);
	        return "test echoMessageMapping : "+message;
	    }
	    */
/*
	    @MessageMapping("/echo-msg")
	    @SendTo("/greetings")
	    public String echoMessageMappingApp( String message) {
		 log.info("test echoMessageMapping : "+message);
	        return "test echoMessageMapping : "+message;
	    }	*/    
	    /*
	    @MessageMapping("/exchange/amq.direct/chat.message")
	    @SendTo("chat.private.admin")
	    public StompMessage echoMessageMapping2( String message) {
		 log.info("test echoMessageMapping-2 : "+message);
		 StompMessage sMessage=new StompMessage();
		 sMessage.setBody("response "+message+"-"+System.currentTimeMillis());		 
	     return sMessage;
	    }*/

	    /*
	    @RequestMapping(value = "/hello-convert-and-send", method = RequestMethod.POST)
	   public void echoConvertAndSend(@RequestParam("msg") String message) {
	        socketService.echoMessage(message);
	    }
	    */
}
