package com.iprimed.voizfonica.pdf;

import java.awt.Color;
import java.io.IOException;
import java.util.List;
 
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;

import com.iprimed.voizfonica.model.User;

import com.lowagie.text.*;
import com.lowagie.text.pdf.*;
 
 
public class UserPDFExporter {
	
    private User listUsers;
    
     
    public UserPDFExporter(User Users) {
        this.listUsers = Users;
    }
 
	
	  private void writeTableHeader(PdfPTable table) { PdfPCell cell = new
	  PdfPCell(); cell.setBackgroundColor(Color.BLUE); cell.setPadding(5);
	  
	  Font font = FontFactory.getFont(FontFactory.HELVETICA);
	  font.setColor(Color.WHITE);
	  
	  cell.setPhrase(new Phrase(" ID", font));
	  
	  table.addCell(cell);
	  
	  cell.setPhrase(new Phrase("E-mail", font)); table.addCell(cell);
	  
	  cell.setPhrase(new Phrase("Full Name", font)); table.addCell(cell);
	  
	  cell.setPhrase(new Phrase("Plan", font)); table.addCell(cell);
	  
	  cell.setPhrase(new Phrase("Expiry Date", font)); table.addCell(cell); }
	 
     
	
	  private void writeTableData(PdfPTable table)  {
	  table.addCell(String.valueOf(listUsers.getId())); table.addCell(listUsers.getEmail());
	  table.addCell(listUsers.getFirstName()); table.addCell(listUsers.getLastName());table.addCell(listUsers.getGender()); }
//	  table.addCell(user.getRoles().toString());
//	  table.addCell(String.valueOf(user.isEnabled())); } }
	  
     
    public void export(HttpServletResponse response) throws DocumentException, IOException {
        Document document = new Document(PageSize.A4);
        PdfWriter.getInstance(document, response.getOutputStream());
         
        document.open();
        Font font = FontFactory.getFont(FontFactory.HELVETICA_BOLD);
        font.setSize(16);
        font.setColor(Color.black);
        Paragraph p6 = new Paragraph(" Invoice of your payment\n\n ", font);
        p6.setAlignment(Paragraph.ALIGN_CENTER);
        document.add(p6);
        
        Paragraph p2 = new Paragraph("VoizFonica", font);
        
        document.add(p2);
        Paragraph p3 = new Paragraph("CareerNet Campus, Ground Floor, \n Plot No.53, Devarabisana Halli, Outer Ring Road,Bellandur Post, \n Bengaluru, Karnataka 560103\n", font);
        
        document.add(p3);
        
        Paragraph p = new Paragraph("\n your plan will sucessfully run till this date: ", font);
        p.setAlignment(Paragraph.ALIGN_CENTER);
        document.add(p);
      
        
         
		
		  PdfPTable table = new PdfPTable(5); table.setWidthPercentage(100f);
		  table.setWidths(new float[] {1.5f, 3.5f, 3.0f, 3.0f, 1.5f});
		  table.setSpacingBefore(10);
		  
		  writeTableHeader(table); writeTableData(table);
		  
		  document.add(table);
		 
    
		  
		  Paragraph p1 = new Paragraph("\n\n\nThank you for connection with VoizFonica\n\n", font); 
	        document.add(p1);
	        Paragraph p4 = new Paragraph("Terms And Conditions-\n", font);
	        document.add(p4);
	        font.setSize(14);
	        font.setColor(Color.black);
	        Paragraph p5 = new Paragraph("    1. Don't make payment other than this website.\n     2. For any such fraud voizfonica will not be responsible", font); 
	        document.add(p5);
	        
		  
		 
        document.close();
    }
}
