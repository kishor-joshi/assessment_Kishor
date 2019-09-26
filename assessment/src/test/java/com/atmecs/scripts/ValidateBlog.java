package com.atmecs.scripts;

import org.testng.annotations.Test;

import com.atmecs.blogs.Blogs;
import com.atmecs.utils.BaseClass;

public class ValidateBlog extends BaseClass {
	Blogs blog=new Blogs();
	
	@Test
public void validatebloger() throws Exception {
	blog.validateFooterAtServices(driver);
	blog.validateBlog(driver);
}
}
