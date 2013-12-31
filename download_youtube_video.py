# pip install pytube3 --upgrade

from pytube import YouTube

youtube = YouTube('https://www.youtube.com/watch?v=9q-QtBMjlR8')

for stream in youtube.streams:
    print(stream)

''' # To download
from pytube import YouTube

youtube = YouTube('https://www.youtube.com/watch?v=9q-QtBMjlR8')

youtube.streams.get_highest_resolution().download()
'''

# Whole playlist
'''
from pytube import Playlist

playlist = Playlist("https://www.youtube.com/watch?v=Zl_-LrT5uxg&list=PL6V_jTjwqA9nrYJ8SyYkcxZI6t5G-vmdZ")

for video in playlist:
    print(video)
'''

'''
from pytube import Playlist, YouTube

playlist = Playlist("https://www.youtube.com/watch?v=Zl_-LrT5uxg&list=PL6V_jTjwqA9nrYJ8SyYkcxZI6t5G-vmdZ")

for video in playlist:
    youtube = YouTube(video)

    youtube.streams.get_highest_resolution().download()
'''