package com.hf.cloudpicture.modle.dto.picture;

import lombok.Data;

import java.io.Serializable;

@Data
public class PictureUploadRequest implements Serializable {

    /**
     * 图片 id（用于修改）
     */
    private Long id;

    /**
     * 图片 url
     */
    private String fileUrl;

    /**
     * 名称前缀
     */
    private String namePrefix;

    /**
     * 图片名称
     */
    private String picName;

    private static final long serialVersionUID = 1L;


}

