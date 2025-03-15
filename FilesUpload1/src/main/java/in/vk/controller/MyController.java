package in.vk.controller;

import java.io.FileOutputStream;
import java.io.IOException;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

@Controller
public class MyController {

	@GetMapping("/openUploadFile")
	public String openUploadFile() {
		return "upload-file";
	}
	
	@PostMapping("/uploadFileForm")
	public String fileUploadForm(@RequestParam MultipartFile myfile, Model model) {
		String status;
		
		try {
			String file_name = myfile.getOriginalFilename();
			byte [] file_in_bytes = myfile.getBytes();
			
			try (FileOutputStream fos = new FileOutputStream("C:\\Users\\kundu\\3D Objects\\"+file_name)) {
				fos.write(file_in_bytes);
			}
			status = "File Uploaded Succesfully";
		} catch (IOException e) {

			e.printStackTrace();
			status = "File not uploaded due to some error";

		}
		model.addAttribute("m_upload_status",status);
		
		return "status";
	}
}
