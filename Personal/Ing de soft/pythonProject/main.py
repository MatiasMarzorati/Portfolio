from http.server import BaseHTTPRequestHandler, HTTPServer
import os

class SimpleHTTPRequestHandler(BaseHTTPRequestHandler):
    def do_GET(self):
        # Define the path to the HTML file
        html_file_path = "index.html"

        # Check if the file exists
        if os.path.exists(html_file_path):
            # Read the content of the HTML file
            with open(html_file_path, 'rb') as file:
                html_content = file.read()

            # Send response status code
            self.send_response(200)
            # Send headers
            self.send_header("Content-type", "text/html")
            self.end_headers()
            # Write the HTML content to the response
            self.wfile.write(html_content)
        else:
            # If the file is not found, send a 404 response
            self.send_response(404)
            self.send_header("Content-type", "text/html")
            self.end_headers()
            self.wfile.write(b"404 Not Found")


def run(server_class=HTTPServer, handler_class=SimpleHTTPRequestHandler, port=8080):
    server_address = ('', port)
    httpd = server_class(server_address, handler_class)
    print(f'Starting httpd on port {port}...')
    httpd.serve_forever()

if __name__ == "__main__":
    run()
