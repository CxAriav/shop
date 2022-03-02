public class S3Sdk {

	public void Foo() {

		
		AmazonS3.completeMultipartUpload("S3_1");
		AmazonS3EncryptionClient.download("S3_2");
//		AmazonS3EncryptionClientV2.getObject("Bucket16");
//		S3Client.getObjectMetadata("Bucket17");
	}
}