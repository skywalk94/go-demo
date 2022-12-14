package org.example.reggie.controller;

import org.example.reggie.common.R;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

@RestController
@RequestMapping("/common")
public class CommonController {
    //        文件上传
    @PostMapping("/upload")
    public R<String> upload(MultipartFile file) throws IOException {
        file.transferTo(new File("D:\\Desktop\\" + file.getOriginalFilename()));
        return R.success("上传成功");
    }
}
